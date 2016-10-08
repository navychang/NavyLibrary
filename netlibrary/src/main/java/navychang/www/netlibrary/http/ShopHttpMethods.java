package navychang.www.netlibrary.http;

import android.util.Log;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import navychang.www.netlibrary.entity.HttpResult;
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

    public static final String BASE_URL = "http://120.27.50.197:8081/ykp/";//公司外网

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

    /**
     * 用于获取豆瓣电影Top250的数据
     *
     * @param /subscriber 由调用者传过来的观察者对象
     * @param /start      起始位置
     * @param /count      获取长度
     */
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
        String token = "";
        try {
//            token = ValidateUtil.getSignature(tokenMap, "123456");
            token = ValidateUtil.getSignature(tokenMap, "123456");
        } catch (IOException e) {
            e.printStackTrace();
        }


        Observable observable = shopService.getShop(jlbid,token)
                .map(new HttpResultFunc<ShopBean>());

//        shopService.getShop(token,jlbid)
//                .subscribeOn(Schedulers.io())
//                .unsubscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(subscriber);


        toSubscribe(observable, subscriber);


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
