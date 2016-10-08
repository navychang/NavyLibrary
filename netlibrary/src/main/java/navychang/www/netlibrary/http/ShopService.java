package navychang.www.netlibrary.http;

import android.media.session.MediaSession;

import java.util.List;

import navychang.www.netlibrary.entity.HttpResult;
import navychang.www.netlibrary.entity.ShopBean;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by navychang on 16/10/2.
 */
public interface ShopService {

    MediaSession.Token token = null;

    @GET("shop/getShopView")
    Observable<HttpResult<ShopBean>> getShop( @Query("jlbid") int jlbid,@Query("token") String token);


    @GET("shop/getShopView")
    Observable<HttpResult<ShopBean>> getShopToken(@Header("token")  MediaSession.Token  token, @Query("jlbid") int jlbid);





    @GET("top250")
    Observable<HttpResult<List<ShopBean>>> getTopMovie(@Query("start") int start, @Query("count") int count);
}
