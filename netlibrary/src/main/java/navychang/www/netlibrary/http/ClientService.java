package navychang.www.netlibrary.http;

import navychang.www.netlibrary.entity.AdGson;
import navychang.www.netlibrary.entity.DynamicGson;
import navychang.www.netlibrary.entity.HttpResult;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by navychang on 17/3/20.
 */

public interface ClientService {
    /**
     * URL	http://120.27.50.197:9080/ykp/usermana/getad
     * 获取头部试图相关信息，banner，公告，俱乐部名称，赛事
     * token	5b3939fb72b6c8c2e589dbe9acff95b5
     * uid	627
     * gid	64
     */
    @FormUrlEncoded
    @POST("usermana/getad")
    Observable<HttpResult<AdGson>> getad(@Field("token") String token,
                                         @Field("uid") String uid,
                                         @Field("gid") String gid
    );

    /**
     * URL http://120.27.50.197:9080/ykp/usermana/upjlb
     * 更新俱乐部的banner 顶部图片
     * token	e3f772f1bdee21e95b7a6edf9b43d500
     * curphoto	/dt/20170320/img/1489990290041.jpg
     * jid	95
     */
    @FormUrlEncoded
    @POST("usermana/upjlb")
    Observable<HttpResult<String>> upJlbBanner(@Field("token") String token,
                                               @Field("curphoto") String curphoto,
                                               @Field("jid") String jid
    );


    /**
     * URL	http://120.27.50.197:9080/ykp/user/getDynamicByUid
     * 获取俱乐部所有动态
     * token	5be7b23128b5ec219d81f66e4ee98f0b
     * begin	1
     * loginid	1935    getGroupPosts
     * pid	95
     */
    @FormUrlEncoded
    @POST("user/getDynamicByUid")
    Observable<HttpResult<DynamicGson>> getGroupPosts(@Field("token") String token,
                                                      @Field("begin") String begin,
                                                      @Field("loginid") String loginid,
                                                      @Field("pid") String pid
    );


    /**
     * URL	http://120.27.50.197:9080/ykp/user/addOrUprunnergroup
     * 发布动态到跑友圈
     * jid	64
     * token	f51452e1846e09d7d3fca2531ac7e7c3
     * uid	627
     * ac	1    新增为1
     * photourls	/dt/20170327/img/1490587102299.jpg
     * isshowplace	0
     * place
     * content	晴天啦－
     */
    @FormUrlEncoded
    @POST("user/addOrUprunnergroup")
    Observable<HttpResult<DynamicGson>> addGroupPost(@Field("token") String token,
                                                     @Field("jid") String jid,
                                                     @Field("uid") String uid,
                                                     @Field("ac") String ac,
                                                     @Field("photourls") String photourls,
                                                     @Field("isshowplace") String isshowplace,
                                                     @Field("place") String place,
                                                     @Field("content") String content
    );


    /**
     * URL	http://120.27.50.197:9080/ykp/user/addOrUprunnergroup
     * gid	586
     * jid	64
     * token	9562c6017c9d0c8c6dc2707ed4f1cd49
     * uid	627
     * ac	0    修改为0
     * photourls	,/dt/20170327/img/1490587102299.jpg
     * isshowplace	0
     * place
     * content	晴天啦－  hhh
     */
    @FormUrlEncoded
    @POST("user/addOrUprunnergroup")
    Observable<HttpResult<DynamicGson>> updateGroupPost(@Field("token") String token,
                                                        @Field("jid") String jid,
                                                        @Field("uid") String uid,
                                                        @Field("gid") String gid,
                                                        @Field("ac") String ac,
                                                        @Field("photourls") String photourls,
                                                        @Field("isshowplace") String isshowplace,
                                                        @Field("place") String place,
                                                        @Field("content") String content
    );


    /**
     * URL	http://120.27.50.197:9080/ykp/user/addOrUprunnergroup
     * gid	587
     * uid	1
     * jid	1
     * ac	0
     * token	efcd20912eed91daf7c8d776f1ae1bc1
     * delete	1
     */
    @FormUrlEncoded
    @POST("user/addOrUprunnergroup")
    Observable<HttpResult<DynamicGson>> delGroupPost(@Field("token") String token,
                                                     @Field("jid") String jid,
                                                     @Field("uid") String uid,
                                                     @Field("gid") String gid,
                                                     @Field("ac") String ac,
                                                     @Field("delete") String delete
    );


    /**
     * URL http://120.27.50.197:9080/ykp/user/getDynamicByUid
     * 查询个人中心里此用户的所有动态列表
     * token	038f4fc0a10c04557b5a430af6483d22
     * begin	1
     * uid	627
     * loginid	627
     */
    @FormUrlEncoded
    @POST("user/getDynamicByUid")
    Observable<HttpResult<DynamicGson>> getUserPosts(@Field("token") String token,
                                                     @Field("begin") String begin,
                                                     @Field("uid") String uid,
                                                     @Field("loginid") String loginid


    );


}
