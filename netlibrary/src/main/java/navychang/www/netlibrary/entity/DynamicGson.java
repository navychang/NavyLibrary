package navychang.www.netlibrary.entity;

import java.util.List;

/**
 * Created by navychang on 17/3/20.
 */

public class DynamicGson {

    private List<DynamicBean> dynamiclist;

    public List<DynamicBean> getDynamiclist() {
        return dynamiclist;
    }

    public void setDynamiclist(List<DynamicBean> dynamiclist) {
        this.dynamiclist = dynamiclist;
    }

    public static class DynamicBean {
        /**
         * uid : 1935
         * id : 580
         * dynamic : 那么麻烦吗？
         * commentNum : 0
         * isShowplace : 0
         * publishTime : 2017-03-20 14:12:25
         * zan : 0
         * isLike : 0
         * uname : 15256920144
         * photourl : [{"photourl":"/dt/20170320/img/1489990345060.jpg"}]
         * uphoto : null
         * place :
         */

        private int uid;
        private int id;
        private String dynamic;
        private int commentNum;
        private String isShowplace;
        private String publishTime;
        private int zan;
        private int isLike;
        private String uname;
        private Object uphoto;
        private String place;
        private List<PhotourlBean> photourl;

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDynamic() {
            return dynamic;
        }

        public void setDynamic(String dynamic) {
            this.dynamic = dynamic;
        }

        public int getCommentNum() {
            return commentNum;
        }

        public void setCommentNum(int commentNum) {
            this.commentNum = commentNum;
        }

        public String getIsShowplace() {
            return isShowplace;
        }

        public void setIsShowplace(String isShowplace) {
            this.isShowplace = isShowplace;
        }

        public String getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(String publishTime) {
            this.publishTime = publishTime;
        }

        public int getZan() {
            return zan;
        }

        public void setZan(int zan) {
            this.zan = zan;
        }

        public int getIsLike() {
            return isLike;
        }

        public void setIsLike(int isLike) {
            this.isLike = isLike;
        }

        public String getUname() {
            return uname;
        }

        public void setUname(String uname) {
            this.uname = uname;
        }

        public Object getUphoto() {
            return uphoto;
        }

        public void setUphoto(Object uphoto) {
            this.uphoto = uphoto;
        }

        public String getPlace() {
            return place;
        }

        public void setPlace(String place) {
            this.place = place;
        }

        public List<PhotourlBean> getPhotourl() {
            return photourl;
        }

        public void setPhotourl(List<PhotourlBean> photourl) {
            this.photourl = photourl;
        }

        public static class PhotourlBean {
            /**
             * photourl : /dt/20170320/img/1489990345060.jpg
             */

            private String photourl;

            public String getPhotourl() {
                return photourl;
            }

            public void setPhotourl(String photourl) {
                this.photourl = photourl;
            }
        }
    }
}
