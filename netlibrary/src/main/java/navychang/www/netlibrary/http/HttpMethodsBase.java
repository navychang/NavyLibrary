package navychang.www.netlibrary.http;

import android.util.Log;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import navychang.www.netlibrary.entity.HttpResult;
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

public class HttpMethodsBase {

    String BASE_URL = UrlBase.BASE_URL;//公司外网

    private static final int DEFAULT_TIMEOUT = 5;

    private Retrofit retrofit;
    private ShopService theService;
    Map<String, Object> tokenMap = new HashMap<String, Object>();

    //构造方法私有
    private HttpMethodsBase() {
        //手动创建一个OkHttpClient并设置超时时间
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);

        retrofit = new Retrofit.Builder()
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build();


        theService = retrofit.create(ShopService.class);
    }

    //在访问HttpMethods时创建单例
    private static class SingletonHolder {
        private static final HttpMethodsBase INSTANCE = new HttpMethodsBase();
    }

    //获取单例
    public static HttpMethodsBase getInstance() {
        return SingletonHolder.INSTANCE;
    }



    private <T> void toSubscribe(Observable<T> o, Subscriber<T> s) {
        o.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(s);
    }
    /**
     *  Token加密
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


}
