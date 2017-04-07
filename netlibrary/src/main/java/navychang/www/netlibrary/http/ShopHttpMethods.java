package navychang.www.netlibrary.http;

import android.util.Log;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import navychang.www.netlibrary.entity.AddressBean;
import navychang.www.netlibrary.entity.HttpResult;
import navychang.www.netlibrary.entity.SaiShiBean;
import navychang.www.netlibrary.entity.ShopBean;
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
 * Created by liukun on 16/3/9.
 */
public class ShopHttpMethods {

    String BASE_URL = UrlBase.BASE_URL;//公司外网

    private static final int DEFAULT_TIMEOUT = 5;

    private Retrofit retrofit;
    private ShopService shopService;

    //构造方法私有
    private ShopHttpMethods() {
        //手动创建一个OkHttpClient并设置超时时间
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);

        retrofit = new Retrofit.Builder()
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build();


        shopService = retrofit.create(ShopService.class);
    }

    //在访问HttpMethods时创建单例
    private static class SingletonHolder {
        private static final ShopHttpMethods INSTANCE = new ShopHttpMethods();
    }

    //获取单例
    public static ShopHttpMethods getInstance() {
        return SingletonHolder.INSTANCE;
    }


//    public void getTopMovie(Subscriber<List<Subject>> subscriber, int start, int count){
//
////        movieService.getTopMovie(start, count)
////                .map(new HttpResultFunc<List<Subject>>())
////                .subscribeOn(Schedulers.io())
////                .unsubscribeOn(Schedulers.io())
////                .observeOn(AndroidSchedulers.mainThread())
////                .subscribe(subscriber);
//
//        Observable observable = movieService.getTopMovie(start, count)
//                .map(new HttpResultFunc<List<Subject>>());
//
//        toSubscribe(observable, subscriber);
//    }
    public void getShopBean(Subscriber<ShopBean> subscriber, Map<String, Object> tokenMap, int jlbid) {

        //  加密
        String token = getTheToken(tokenMap);


        Observable observable = shopService.getShop(jlbid,token)
                .map(new HttpResultFunc<ShopBean>());

//        shopService.getShop(token,jlbid)
//                .subscribeOn(Schedulers.io())
//                .unsubscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(subscriber);


        toSubscribe(observable, subscriber);


    }



    public void getAddressList(Subscriber<SaiShiBean> subscriber, Map<String, Object> tokenMap,  String uid) {
        String token = getTheToken(tokenMap);


        Observable observable = shopService.getAddressList(token,uid)
                .map(new HttpResultFunc<List<AddressBean>>());




        toSubscribe(observable, subscriber);


    }



    public void getMySaiShi(Subscriber<SaiShiBean> subscriber, Map<String, Object> tokenMap, String jlbid, String uid, int begin, String isactivity) {
        String token = getTheToken(tokenMap);


        Observable observable = shopService.getMySaiShi(token,jlbid,uid,begin,isactivity)
                .map(new HttpResultFunc<SaiShiBean>());




        toSubscribe(observable, subscriber);


    }

    private String getTheToken(Map<String, Object> tokenMap) {
        //  加密
        String token = "";
        try {
//            token = ValidateUtil.getSignature(tokenMap, "123456");
            token = ValidateUtil.getSignature(tokenMap, "123456");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return token;
    }

    private <T> void toSubscribe(Observable<T> o, Subscriber<T> s) {
        o.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(s);
    }

    /**
     * 用来统一处理Http的resultCode,并将HttpResult的Data部分剥离出来返回给subscriber
     *
     * @param <T> Subscriber真正需要的数据类型，也就是Data部分的数据类型
     */
    private class HttpResultFunc<T> implements Func1<HttpResult<T>, T> {

        @Override
        public T call(HttpResult<T> httpResult) {


            Log.e("navy",httpResult.toString());
            if (!httpResult.isSuccess()) {
                throw new ApiException(httpResult.getMsg());
            }else if(httpResult.getData() == null){
                throw new ApiException(ApiException.WRONG_OTHER);
            }
            return httpResult.getData();
        }
    }

}
