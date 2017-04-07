package navychang.www.netlibrary.http;

import android.media.session.MediaSession;

import java.util.List;

import navychang.www.netlibrary.entity.AddressBean;
import navychang.www.netlibrary.entity.HttpResult;
import navychang.www.netlibrary.entity.SaiShiBean;
import navychang.www.netlibrary.entity.ShopBean;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by navychang on 16/10/2.
 */
public interface ShopService {

    MediaSession.Token token = null;

    @GET("shop/getShopView")
    Observable<HttpResult<ShopBean>> getShop( @Query("jlbid") int jlbid,@Query("token") String token);


    @POST("activity/queryMyActivity")
    Observable<HttpResult<SaiShiBean>> getMySaiShi(@Query("token") String token,
                                                   @Query("jlbid") String jlbid,
                                                   @Query("uid") String uid,
                                                   @Query("begin") int begin,
                                                   @Query("isactivity") String isactivity
                                                 );



    @POST("shop/addressManage")//userId	1555
    Observable<HttpResult<List<AddressBean>>> getAddressList(@Query("userId") String jlbid, @Query("token") String token);








}
