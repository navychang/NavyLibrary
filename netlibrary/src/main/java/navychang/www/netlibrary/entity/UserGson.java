package navychang.www.netlibrary.entity;

/**
 * Created by navychang on 17/3/17.
 */

public class UserGson {

    /**
     * data : {"userinfo":{"uid":1935,"emcontactname":"","loginphone":"","other":"","joinclubtime":"","permis":"","visitDate":"2017-03-03 17:32:27","shopid":87,"user_idcard":"","user_weight":0,"totalrum":0,"userPhone":"15256920144","uphoto":"","edu":0,"UName":"15256920144","isfocus":1,"live":"","user_height":0,"shoes":"","userIntegral":0,"cardnum":"","nickname":"15256920144","job":"","isclubcreater":1,"user_age":0,"country":"","isrz":0,"bloodType":0,"pwd":"","userJlbid":95,"udes":"","topscore":"","email":"","dress":"","batch":"","userGroup":1,"vipdate":"","userSex":"","isAdmin":0,"emcontact":"","snnum":"","isvip":0}}
     */
//
//    private DataBean data;
//
//    public DataBean getData() {
//        return data;
//    }
//
//    public void setData(DataBean data) {
//        this.data = data;
//    }
//
//    public static class DataBean {
        /**
         * userinfo : {"uid":1935,"emcontactname":"","loginphone":"","other":"","joinclubtime":"","permis":"","visitDate":"2017-03-03 17:32:27","shopid":87,"user_idcard":"","user_weight":0,"totalrum":0,"userPhone":"15256920144","uphoto":"","edu":0,"UName":"15256920144","isfocus":1,"live":"","user_height":0,"shoes":"","userIntegral":0,"cardnum":"","nickname":"15256920144","job":"","isclubcreater":1,"user_age":0,"country":"","isrz":0,"bloodType":0,"pwd":"","userJlbid":95,"udes":"","topscore":"","email":"","dress":"","batch":"","userGroup":1,"vipdate":"","userSex":"","isAdmin":0,"emcontact":"","snnum":"","isvip":0}
         */

        private UserinfoBean userinfo;

        public UserinfoBean getUserinfo() {
            return userinfo;
        }

        public void setUserinfo(UserinfoBean userinfo) {
            this.userinfo = userinfo;
        }

        public static class UserinfoBean {
            /**
             * uid : 1935
             * emcontactname :
             * loginphone :
             * other :
             * joinclubtime :
             * permis :
             * visitDate : 2017-03-03 17:32:27
             * shopid : 87
             * user_idcard :
             * user_weight : 0
             * totalrum : 0
             * userPhone : 15256920144
             * uphoto :
             * edu : 0
             * UName : 15256920144
             * isfocus : 1
             * live :
             * user_height : 0
             * shoes :
             * userIntegral : 0
             * cardnum :
             * nickname : 15256920144
             * job :
             * isclubcreater : 1
             * user_age : 0
             * country :
             * isrz : 0
             * bloodType : 0
             * pwd :
             * userJlbid : 95
             * udes :
             * topscore :
             * email :
             * dress :
             * batch :
             * userGroup : 1
             * vipdate :
             * userSex :
             * isAdmin : 0
             * emcontact :
             * snnum :
             * isvip : 0
             */

            private int uid;
            private String emcontactname;
            private String loginphone;
            private String other;
            private String joinclubtime;
            private String permis;
            private String visitDate;
            private int shopid;
            private String user_idcard;
            private int user_weight;
            private int totalrum;
            private String userPhone;
            private String uphoto;
            private int edu;
            private String UName;
            private int isfocus;
            private String live;
            private int user_height;
            private String shoes;
            private int userIntegral;
            private String cardnum;
            private String nickname;
            private String job;
            private int isclubcreater;
            private int user_age;
            private String country;
            private int isrz;
            private int bloodType;
            private String pwd;
            private int userJlbid;
            private String udes;
            private String topscore;
            private String email;
            private String dress;
            private String batch;
            private int userGroup;
            private String vipdate;
            private String userSex;
            private int isAdmin;
            private String emcontact;
            private String snnum;
            private int isvip;

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public String getEmcontactname() {
                return emcontactname;
            }

            public void setEmcontactname(String emcontactname) {
                this.emcontactname = emcontactname;
            }

            public String getLoginphone() {
                return loginphone;
            }

            public void setLoginphone(String loginphone) {
                this.loginphone = loginphone;
            }

            public String getOther() {
                return other;
            }

            public void setOther(String other) {
                this.other = other;
            }

            public String getJoinclubtime() {
                return joinclubtime;
            }

            public void setJoinclubtime(String joinclubtime) {
                this.joinclubtime = joinclubtime;
            }

            public String getPermis() {
                return permis;
            }

            public void setPermis(String permis) {
                this.permis = permis;
            }

            public String getVisitDate() {
                return visitDate;
            }

            public void setVisitDate(String visitDate) {
                this.visitDate = visitDate;
            }

            public int getShopid() {
                return shopid;
            }

            public void setShopid(int shopid) {
                this.shopid = shopid;
            }

            public String getUser_idcard() {
                return user_idcard;
            }

            public void setUser_idcard(String user_idcard) {
                this.user_idcard = user_idcard;
            }

            public int getUser_weight() {
                return user_weight;
            }

            public void setUser_weight(int user_weight) {
                this.user_weight = user_weight;
            }

            public int getTotalrum() {
                return totalrum;
            }

            public void setTotalrum(int totalrum) {
                this.totalrum = totalrum;
            }

            public String getUserPhone() {
                return userPhone;
            }

            public void setUserPhone(String userPhone) {
                this.userPhone = userPhone;
            }

            public String getUphoto() {
                return uphoto;
            }

            public void setUphoto(String uphoto) {
                this.uphoto = uphoto;
            }

            public int getEdu() {
                return edu;
            }

            public void setEdu(int edu) {
                this.edu = edu;
            }

            public String getUName() {
                return UName;
            }

            public void setUName(String UName) {
                this.UName = UName;
            }

            public int getIsfocus() {
                return isfocus;
            }

            public void setIsfocus(int isfocus) {
                this.isfocus = isfocus;
            }

            public String getLive() {
                return live;
            }

            public void setLive(String live) {
                this.live = live;
            }

            public int getUser_height() {
                return user_height;
            }

            public void setUser_height(int user_height) {
                this.user_height = user_height;
            }

            public String getShoes() {
                return shoes;
            }

            public void setShoes(String shoes) {
                this.shoes = shoes;
            }

            public int getUserIntegral() {
                return userIntegral;
            }

            public void setUserIntegral(int userIntegral) {
                this.userIntegral = userIntegral;
            }

            public String getCardnum() {
                return cardnum;
            }

            public void setCardnum(String cardnum) {
                this.cardnum = cardnum;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getJob() {
                return job;
            }

            public void setJob(String job) {
                this.job = job;
            }

            public int getIsclubcreater() {
                return isclubcreater;
            }

            public void setIsclubcreater(int isclubcreater) {
                this.isclubcreater = isclubcreater;
            }

            public int getUser_age() {
                return user_age;
            }

            public void setUser_age(int user_age) {
                this.user_age = user_age;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public int getIsrz() {
                return isrz;
            }

            public void setIsrz(int isrz) {
                this.isrz = isrz;
            }

            public int getBloodType() {
                return bloodType;
            }

            public void setBloodType(int bloodType) {
                this.bloodType = bloodType;
            }

            public String getPwd() {
                return pwd;
            }

            public void setPwd(String pwd) {
                this.pwd = pwd;
            }

            public int getUserJlbid() {
                return userJlbid;
            }

            public void setUserJlbid(int userJlbid) {
                this.userJlbid = userJlbid;
            }

            public String getUdes() {
                return udes;
            }

            public void setUdes(String udes) {
                this.udes = udes;
            }

            public String getTopscore() {
                return topscore;
            }

            public void setTopscore(String topscore) {
                this.topscore = topscore;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getDress() {
                return dress;
            }

            public void setDress(String dress) {
                this.dress = dress;
            }

            public String getBatch() {
                return batch;
            }

            public void setBatch(String batch) {
                this.batch = batch;
            }

            public int getUserGroup() {
                return userGroup;
            }

            public void setUserGroup(int userGroup) {
                this.userGroup = userGroup;
            }

            public String getVipdate() {
                return vipdate;
            }

            public void setVipdate(String vipdate) {
                this.vipdate = vipdate;
            }

            public String getUserSex() {
                return userSex;
            }

            public void setUserSex(String userSex) {
                this.userSex = userSex;
            }

            public int getIsAdmin() {
                return isAdmin;
            }

            public void setIsAdmin(int isAdmin) {
                this.isAdmin = isAdmin;
            }

            public String getEmcontact() {
                return emcontact;
            }

            public void setEmcontact(String emcontact) {
                this.emcontact = emcontact;
            }

            public String getSnnum() {
                return snnum;
            }

            public void setSnnum(String snnum) {
                this.snnum = snnum;
            }

            public int getIsvip() {
                return isvip;
            }

            public void setIsvip(int isvip) {
                this.isvip = isvip;
            }
        }
//    }
}
