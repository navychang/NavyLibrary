package navychang.www.netlibrary.http;

import android.util.Log;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import navychang.www.netlibrary.entity.HttpResult;
import navychang.www.netlibrary.entity.LoginGson;
import navychang.www.netlibrary.entity.UserGson;
import navychang.www.netlibrary.entity.UsersGson;
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

public class CommonHttpMethods {

    String BASE_URL = UrlBase.BASE_URL;//公司外网

    private static final int DEFAULT_TIMEOUT = 5;

    private Retrofit retrofit;
    private CommonService theService;
    Map<String, Object> tokenMap = new HashMap<String, Object>();

    //构造方法私有
    private CommonHttpMethods() {
        //手动创建一个OkHttpClient并设置超时时间
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);

        retrofit = new Retrofit.Builder()
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build();


        theService = retrofit.create(CommonService.class);
    }

    //在访问HttpMethods时创建单例
    private static class SingletonHolder {
        private static final CommonHttpMethods INSTANCE = new CommonHttpMethods();
    }

    //获取单例
    public static CommonHttpMethods getInstance() {
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


            Log.e("navy", httpResult.toString());
            if (!httpResult.isSuccess()) {
                throw new ApiException(httpResult.getMsg());
            } else if (httpResult.getData() == null) {
                throw new ApiException(ApiException.WRONG_OTHER);
            }
            return httpResult.getData();
        }
    }

    //==========在此下方构建需要的相应的方法就OK啦==========================================================================================================================
    public void getCodeLogin(Subscriber<LoginGson> subscriber, String phone, String ac) {
//        String phone, String ac   Map<String, Object> tokenMap,
        tokenMap.clear();
        tokenMap.put("phone",phone);
        tokenMap.put("ac",ac);


        Observable observable = theService.getCodeLogin(getTheToken(tokenMap), phone, ac)
                .map(new HttpResultFunc<LoginGson>());


        toSubscribe(observable, subscriber);


    }

    public void toLogin(Subscriber<UserGson> subscriber, String phone, String pwd, boolean ismanage) {

        tokenMap.clear();
        tokenMap.put("phone",phone);
        tokenMap.put("pwd",pwd);
        tokenMap.put("ismanage",ismanage?"1":"0");

        Observable observable = theService.login(getTheToken(tokenMap), phone, pwd,ismanage?"1":"0","0")
                .map(new HttpResultFunc<UserGson>());


        toSubscribe(observable, subscriber);


    }
    public void getClubUsers(Subscriber<UsersGson> subscriber, String begin, String name, String pid, String loginid) {


        tokenMap.clear();
        tokenMap.put("name",name);
        tokenMap.put("pid",pid);
        tokenMap.put("loginid",loginid);

        Observable observable = theService.getClubUsers(getTheToken(tokenMap),begin,name,pid,loginid)
                .map(new HttpResultFunc<UsersGson>());
        toSubscribe(observable, subscriber);


    }
    public void getUserInfo(Subscriber<UsersGson> subscriber,String uid,String loginid) {

        tokenMap.clear();
        tokenMap.put("uid",uid);
        tokenMap.put("loginid",loginid);
        Observable observable = theService.getUserInfo(getTheToken(tokenMap),uid,loginid)
                .map(new HttpResultFunc<UsersGson>());
        toSubscribe(observable, subscriber);


    }


}
