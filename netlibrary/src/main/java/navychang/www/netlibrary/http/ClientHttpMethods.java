package navychang.www.netlibrary.http;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import navychang.www.netlibrary.entity.AdGson;
import navychang.www.netlibrary.entity.DynamicGson;
import navychang.www.netlibrary.entity.HttpResult;
import navychang.www.netlibrary.utils.LogUtils;
import navychang.www.netlibrary.utils.ValidateUtil;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by navychang on 17/3/14.
 */

public class ClientHttpMethods {

    String BASE_URL = UrlBase.BASE_URL;//公司外网

    private static final int DEFAULT_TIMEOUT = 5;

    private Retrofit retrofit;
    private ClientService theService;
    Map<String, Object> tokenMap = new HashMap<String, Object>();

    //构造方法私有
    private ClientHttpMethods() {
        //手动创建一个OkHttpClient并设置超时时间
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);

        retrofit = new Retrofit.Builder()
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build();


        theService = retrofit.create(ClientService.class);
    }

    //在访问HttpMethods时创建单例
    private static class SingletonHolder {
        private static final ClientHttpMethods INSTANCE = new ClientHttpMethods();
    }

    //获取单例
    public static ClientHttpMethods getInstance() {
        return SingletonHolder.INSTANCE;
    }


    private <T> void toSubscribe(Observable<T> o, Subscriber<T> s) {
        o.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(s);
    }

    /**
     * Token加密
     *
     * @param tokenMap
     * @return
     */
    private String getTheToken(Map<String, Object> tokenMap) {
        String token = "";
        try {
            token = ValidateUtil.getSignature(tokenMap, "123456");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return token;
    }

    /**
     * 用来统一处理Http的resultCode,并将HttpResult的Data部分剥离出来返回给subscriber
     *
     * @param <T> Subscriber真正需要的数据类型，也就是Data部分的数据类型
     */
    private class HttpResultFunc<T> implements Func1<HttpResult<T>, T> {

        @Override
        public T call(HttpResult<T> httpResult) {


            if (!httpResult.isSuccess()) {
                throw new ApiException(httpResult.getMsg());
            } else if (httpResult.getData() == null) {
                throw new ApiException(ApiException.WRONG_OTHER);
            }
//            KLog.a("navy", "请求到的数据为:+++     " + httpResult.getData().toString() + "      +++");

            LogUtils.e("navy", "请求到的数据为:+++     "+httpResult.getData().toString()+"      +++");

            return httpResult.getData();
        }
    }

    //==========在此下方构建需要的相应的方法就OK啦==========================================================================================================================
    public void getad(Subscriber<AdGson> subscriber, String uid, String gid) {
        tokenMap.clear();
        tokenMap.put("uid", uid);
        tokenMap.put("gid", gid);


        Observable observable = theService.getad(getTheToken(tokenMap), uid, gid)
                .map(new HttpResultFunc<AdGson>());


        toSubscribe(observable, subscriber);


    }

    public void getGroupPosts(Subscriber<DynamicGson> subscriber, String begin, String loginid, String pid) {
        tokenMap.clear();
//        tokenMap.put("begin", begin);
        tokenMap.put("loginid", loginid);
        tokenMap.put("pid", pid);


        Observable observable = theService.getGroupPosts(getTheToken(tokenMap), begin, loginid, pid)
                .map(new HttpResultFunc<DynamicGson>());


        toSubscribe(observable, subscriber);


    }


    public void getUserPosts(Subscriber<DynamicGson> subscriber, String begin, String uid, String loginid) {
        tokenMap.clear();
        tokenMap.put("uid", uid);
        tokenMap.put("loginid", loginid);
        Observable observable = theService.getUserPosts(getTheToken(tokenMap), begin, uid, loginid)
                .map(new HttpResultFunc<DynamicGson>());


        toSubscribe(observable, subscriber);


    }


    public void addGroupPost(Subscriber<DynamicGson> subscriber,String jid,String uid,String ac,String photourls,String isshowplace,String place,String content) {
        tokenMap.clear();
        tokenMap.put("jid", jid);
        tokenMap.put("uid", uid);
        tokenMap.put("ac", ac);
        tokenMap.put("photourls", photourls);
        tokenMap.put("isshowplace", isshowplace);
        tokenMap.put("place", place);
        tokenMap.put("content", content);


        Observable observable = theService.addGroupPost(getTheToken(tokenMap),jid,uid,ac,photourls,isshowplace,place,content)
                .map(new HttpResultFunc<DynamicGson>());


        toSubscribe(observable, subscriber);


    }

    public void updateGroupPost(Subscriber<DynamicGson> subscriber,String jid,String uid,String gid,String ac,String photourls,String isshowplace,String place,String content) {
        tokenMap.clear();
        tokenMap.put("jid",jid);
        tokenMap.put("uid",uid);
        tokenMap.put("gid",gid);
        tokenMap.put("ac",ac);
        tokenMap.put("photourls",photourls);
        tokenMap.put("isshowplace",isshowplace);
        tokenMap.put("place",place);
        tokenMap.put("content",content);


        Observable observable = theService.updateGroupPost(getTheToken(tokenMap), jid, uid, gid, ac, photourls, isshowplace, place, content)
                .map(new HttpResultFunc<DynamicGson>());


        toSubscribe(observable, subscriber);


    }

    public void delGroupPost(Subscriber<DynamicGson> subscriber,String jid,String uid,String gid,String ac,String delete) {
        tokenMap.clear();
        tokenMap.put("jid",jid);
        tokenMap.put("uid",uid);
        tokenMap.put("gid",gid);
        tokenMap.put("ac",ac);
        tokenMap.put("delete",delete);

        Observable observable = theService.delGroupPost(getTheToken(tokenMap), jid,uid,gid,ac,delete)
                .map(new HttpResultFunc<DynamicGson>());


        toSubscribe(observable, subscriber);


    }

}
