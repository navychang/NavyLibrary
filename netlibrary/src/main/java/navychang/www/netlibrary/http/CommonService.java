package navychang.www.netlibrary.http;

import navychang.www.netlibrary.entity.HttpResult;
import navychang.www.netlibrary.entity.LoginGson;
import navychang.www.netlibrary.entity.UserGson;
import navychang.www.netlibrary.entity.UsersGson;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * 一块跑通用API
 * Created by navychang on 17/3/17.
 */

public interface CommonService {


    /**
     * URL http://120.27.50.197:9080/ykp/msg/getcodelogin
     * 获取短信校验码
     * phone	18651694553
     * token	f914e1e9d6281e0d428531503e8b9a7d
     * ac	1489721023776
     */
    @FormUrlEncoded
    @POST("msg/getcodelogin")
    Observable<HttpResult<LoginGson>> getCodeLogin(@Field("token") String token,
                                                   @Field("phone") String phone,
                                                   @Field("ac") String ac
    );


    /**
     * URL http://120.27.50.197:9080/ykp/user/login
     * 用户登录
     * phone	15256920144
     * token	1b84fff393a5ea2454ce3f6b3e69b939
     * ismanage	1
     * pwd	1634
     * loginType 0
     * <p>
     * ismanage=1   是管理端
     * ismanage=0   是客户端端
     * 用此来区分两个端的
     */
    @FormUrlEncoded
    @POST("user/login")
    Observable<HttpResult<UserGson>> login(@Field("token") String token,
                                           @Field("phone") String phone,
                                           @Field("pwd") String pwd,
                                           @Field("ismanage") String ismanage,
                                           @Field("loginType") String loginType
    );

    /**
     * URL	http://192.168.1.108:8080/ykp/user/selectAllUserMsg
     * 根据用户ID 查询用户信息
     * token	cbd4c5f6c6e07968444a1c03fed8e4cb
     * uid	1276
     */
    @FormUrlEncoded
    @POST("user/selectAllUserMsg")
    Observable<HttpResult<UserGson>> getUserInfo(@Field("token") String token,
                                                 @Field("uid") String uid
    );


    /**
     * URL http://120.27.50.197:9080/ykp/user/upimg
     * 上传图片到服务器
     * token	284dc9f2c113e869b9e7ed2961131536
     * img	[{"img":"..."}]
     */
    @FormUrlEncoded
    @POST("user/upimg")
    //// TODO: 17/3/20 "替换其中的bean类   上传图片的gsonbean"
    Observable<HttpResult<UserGson>> upImage(@Field("token") String token,
                                             @Field("img") String uid
    );

    /**
     * URL	http://120.27.50.197:9080/ykp/user/getuserList
     * 查询俱乐部成员
     * name
     * begin	1
     * pid	64
     * token	596221113d0bc25b309d1568a66574c3
     * loginid	627
     */
    @FormUrlEncoded
    @POST("user/getuserList")
    Observable<HttpResult<UsersGson>> getClubUsers(@Field("token") String token,
                                                   @Field("begin") String begin,
                                                   @Field("name") String name,
                                                   @Field("pid") String pid,
                                                   @Field("loginid") String loginid
    );

    /**
     * URL	http://120.27.50.197:9080/ykp/user/getuserList
     * 查询俱乐部成员
     * token	6da5f5621282525f28f3e154805ba5d0
     * uid	1555
     * loginid	627
     */
    @FormUrlEncoded
    @POST("user/getuserList")
    Observable<HttpResult<UsersGson>> getUserInfo(@Field("token") String token,
                                                 @Field("uid") String uid,
                                                 @Field("loginid") String loginid
    );

}
