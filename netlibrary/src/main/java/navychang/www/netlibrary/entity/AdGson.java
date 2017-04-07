package navychang.www.netlibrary.entity;

import java.util.List;

/**
 * Created by navychang on 17/3/20.
 */

public class AdGson {


    /**
     * curphoto : /dt/20170301/img/1488332507621.jpg
     * activities : [{"endtime":"2017-04-15 15:56","createuid":611,"firetime":"","photourl":"","begintime":"2017-04-15 13:56","ispass":-1,"from":0,"aid":445,"juli":"","type":1,"curtime":"2017-03-20 15:42:02","isvalidate":false,"isjoin":"0","isDelete":0,"numbers":0,"description":[{"content":"。。。","isTextBold":false,"isTextBigSize":false,"isTextJz":false,"color":0,"photoArray":""}],"name":"资源池2(准备中-pt)","money":0,"hasmap":0,"groupid":"8115782221827","lnt":"32.055181","mapfrom":1,"signEndtime":"2017-02-17 13:56","signBegintime":"2017-02-15 13:57","index":0,"mapaddress":"/dt/20170316/img/1489656975432.jpg","maptype":"","url":"","num":100,"totallen":"","jlbid":1,"partyAddress":"江苏省南京市玄武区珠江路381号","pt":"0","lot":"118.801201"},{"endtime":"2017-03-15 19:26","createuid":1659,"firetime":"2017-03-15 18:30:59.0","photourl":"/dt/20170315/img/1489573595457.jpg","begintime":"2017-03-15 18:30","ispass":3,"from":1,"aid":504,"juli":"","type":0,"curtime":"2017-03-20 15:42:02","isvalidate":false,"isjoin":"0","isDelete":0,"numbers":1,"description":[{"content":"逼逼逼逼逼败笔","isTextBold":false,"isTextBigSize":false,"isTextJz":false,"color":0,"photoArray":"[{\"photoUrl\":\"\\/dt\\/20170315\\/img\\/1489573606798.jpg\"}]"}],"name":"打假夜跑","money":0,"hasmap":5,"groupid":"10669530349569","lnt":"32.05511884340646","mapfrom":0,"signEndtime":"","signBegintime":"","index":0,"mapaddress":"","maptype":"2","url":"","num":3,"totallen":"","jlbid":64,"partyAddress":"江苏省南京市玄武区太平北路67号","pt":"1","lot":"118.8025937031636"}]
     * notice : {"content":"欢迎欢迎热烈欢迎","isindex":1,"post_time":{"nanos":0,"time":1489048927000,"minutes":42,"seconds":7,"hours":16,"month":2,"year":117,"timezoneOffset":-480,"day":4,"date":9}}
     * jname : 南京小杆子
     */

    private String curphoto;
    private NoticeBean notice;
    private String jname;
    private List<ActivitiesBean> activities;

    public String getCurphoto() {
        return curphoto;
    }

    public void setCurphoto(String curphoto) {
        this.curphoto = curphoto;
    }

    public NoticeBean getNotice() {
        return notice;
    }

    public void setNotice(NoticeBean notice) {
        this.notice = notice;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public List<ActivitiesBean> getActivities() {
        return activities;
    }

    public void setActivities(List<ActivitiesBean> activities) {
        this.activities = activities;
    }

    public static class NoticeBean {
        /**
         * content : 欢迎欢迎热烈欢迎
         * isindex : 1
         * post_time : {"nanos":0,"time":1489048927000,"minutes":42,"seconds":7,"hours":16,"month":2,"year":117,"timezoneOffset":-480,"day":4,"date":9}
         */

        private String content;
        private int isindex;
        private PostTimeBean post_time;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getIsindex() {
            return isindex;
        }

        public void setIsindex(int isindex) {
            this.isindex = isindex;
        }

        public PostTimeBean getPost_time() {
            return post_time;
        }

        public void setPost_time(PostTimeBean post_time) {
            this.post_time = post_time;
        }

        public static class PostTimeBean {
            /**
             * nanos : 0
             * time : 1489048927000
             * minutes : 42
             * seconds : 7
             * hours : 16
             * month : 2
             * year : 117
             * timezoneOffset : -480
             * day : 4
             * date : 9
             */

            private int nanos;
            private long time;
            private int minutes;
            private int seconds;
            private int hours;
            private int month;
            private int year;
            private int timezoneOffset;
            private int day;
            private int date;

            public int getNanos() {
                return nanos;
            }

            public void setNanos(int nanos) {
                this.nanos = nanos;
            }

            public long getTime() {
                return time;
            }

            public void setTime(long time) {
                this.time = time;
            }

            public int getMinutes() {
                return minutes;
            }

            public void setMinutes(int minutes) {
                this.minutes = minutes;
            }

            public int getSeconds() {
                return seconds;
            }

            public void setSeconds(int seconds) {
                this.seconds = seconds;
            }

            public int getHours() {
                return hours;
            }

            public void setHours(int hours) {
                this.hours = hours;
            }

            public int getMonth() {
                return month;
            }

            public void setMonth(int month) {
                this.month = month;
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }

            public int getTimezoneOffset() {
                return timezoneOffset;
            }

            public void setTimezoneOffset(int timezoneOffset) {
                this.timezoneOffset = timezoneOffset;
            }

            public int getDay() {
                return day;
            }

            public void setDay(int day) {
                this.day = day;
            }

            public int getDate() {
                return date;
            }

            public void setDate(int date) {
                this.date = date;
            }
        }
    }

    public static class ActivitiesBean {
        /**
         * endtime : 2017-04-15 15:56
         * createuid : 611
         * firetime :
         * photourl :
         * begintime : 2017-04-15 13:56
         * ispass : -1
         * from : 0
         * aid : 445
         * juli :
         * type : 1
         * curtime : 2017-03-20 15:42:02
         * isvalidate : false
         * isjoin : 0
         * isDelete : 0
         * numbers : 0
         * description : [{"content":"。。。","isTextBold":false,"isTextBigSize":false,"isTextJz":false,"color":0,"photoArray":""}]
         * name : 资源池2(准备中-pt)
         * money : 0
         * hasmap : 0
         * groupid : 8115782221827
         * lnt : 32.055181
         * mapfrom : 1
         * signEndtime : 2017-02-17 13:56
         * signBegintime : 2017-02-15 13:57
         * index : 0
         * mapaddress : /dt/20170316/img/1489656975432.jpg
         * maptype :
         * url :
         * num : 100
         * totallen :
         * jlbid : 1
         * partyAddress : 江苏省南京市玄武区珠江路381号
         * pt : 0
         * lot : 118.801201
         */

        private String endtime;
        private int createuid;
        private String firetime;
        private String photourl;
        private String begintime;
        private int ispass;
        private int from;
        private int aid;
        private String juli;
        private int type;
        private String curtime;
        private boolean isvalidate;
        private String isjoin;
        private int isDelete;
        private int numbers;
        private String name;
        private double money;
        private int hasmap;
        private String groupid;
        private String lnt;
        private int mapfrom;
        private String signEndtime;
        private String signBegintime;
        private int index;
        private String mapaddress;
        private String maptype;
        private String url;
        private int num;
        private String totallen;
        private int jlbid;
        private String partyAddress;
        private String pt;
        private String lot;
        private List<DescriptionBean> description;

        public String getEndtime() {
            return endtime;
        }

        public void setEndtime(String endtime) {
            this.endtime = endtime;
        }

        public int getCreateuid() {
            return createuid;
        }

        public void setCreateuid(int createuid) {
            this.createuid = createuid;
        }

        public String getFiretime() {
            return firetime;
        }

        public void setFiretime(String firetime) {
            this.firetime = firetime;
        }

        public String getPhotourl() {
            return photourl;
        }

        public void setPhotourl(String photourl) {
            this.photourl = photourl;
        }

        public String getBegintime() {
            return begintime;
        }

        public void setBegintime(String begintime) {
            this.begintime = begintime;
        }

        public int getIspass() {
            return ispass;
        }

        public void setIspass(int ispass) {
            this.ispass = ispass;
        }

        public int getFrom() {
            return from;
        }

        public void setFrom(int from) {
            this.from = from;
        }

        public int getAid() {
            return aid;
        }

        public void setAid(int aid) {
            this.aid = aid;
        }

        public String getJuli() {
            return juli;
        }

        public void setJuli(String juli) {
            this.juli = juli;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getCurtime() {
            return curtime;
        }

        public void setCurtime(String curtime) {
            this.curtime = curtime;
        }

        public boolean isIsvalidate() {
            return isvalidate;
        }

        public void setIsvalidate(boolean isvalidate) {
            this.isvalidate = isvalidate;
        }

        public String getIsjoin() {
            return isjoin;
        }

        public void setIsjoin(String isjoin) {
            this.isjoin = isjoin;
        }

        public int getIsDelete() {
            return isDelete;
        }

        public void setIsDelete(int isDelete) {
            this.isDelete = isDelete;
        }

        public int getNumbers() {
            return numbers;
        }

        public void setNumbers(int numbers) {
            this.numbers = numbers;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        public int getHasmap() {
            return hasmap;
        }

        public void setHasmap(int hasmap) {
            this.hasmap = hasmap;
        }

        public String getGroupid() {
            return groupid;
        }

        public void setGroupid(String groupid) {
            this.groupid = groupid;
        }

        public String getLnt() {
            return lnt;
        }

        public void setLnt(String lnt) {
            this.lnt = lnt;
        }

        public int getMapfrom() {
            return mapfrom;
        }

        public void setMapfrom(int mapfrom) {
            this.mapfrom = mapfrom;
        }

        public String getSignEndtime() {
            return signEndtime;
        }

        public void setSignEndtime(String signEndtime) {
            this.signEndtime = signEndtime;
        }

        public String getSignBegintime() {
            return signBegintime;
        }

        public void setSignBegintime(String signBegintime) {
            this.signBegintime = signBegintime;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public String getMapaddress() {
            return mapaddress;
        }

        public void setMapaddress(String mapaddress) {
            this.mapaddress = mapaddress;
        }

        public String getMaptype() {
            return maptype;
        }

        public void setMaptype(String maptype) {
            this.maptype = maptype;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getTotallen() {
            return totallen;
        }

        public void setTotallen(String totallen) {
            this.totallen = totallen;
        }

        public int getJlbid() {
            return jlbid;
        }

        public void setJlbid(int jlbid) {
            this.jlbid = jlbid;
        }

        public String getPartyAddress() {
            return partyAddress;
        }

        public void setPartyAddress(String partyAddress) {
            this.partyAddress = partyAddress;
        }

        public String getPt() {
            return pt;
        }

        public void setPt(String pt) {
            this.pt = pt;
        }

        public String getLot() {
            return lot;
        }

        public void setLot(String lot) {
            this.lot = lot;
        }

        public List<DescriptionBean> getDescription() {
            return description;
        }

        public void setDescription(List<DescriptionBean> description) {
            this.description = description;
        }

        public static class DescriptionBean {
            /**
             * content : 。。。
             * isTextBold : false
             * isTextBigSize : false
             * isTextJz : false
             * color : 0
             * photoArray :
             */

            private String content;
            private boolean isTextBold;
            private boolean isTextBigSize;
            private boolean isTextJz;
            private int color;
            private String photoArray;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public boolean isIsTextBold() {
                return isTextBold;
            }

            public void setIsTextBold(boolean isTextBold) {
                this.isTextBold = isTextBold;
            }

            public boolean isIsTextBigSize() {
                return isTextBigSize;
            }

            public void setIsTextBigSize(boolean isTextBigSize) {
                this.isTextBigSize = isTextBigSize;
            }

            public boolean isIsTextJz() {
                return isTextJz;
            }

            public void setIsTextJz(boolean isTextJz) {
                this.isTextJz = isTextJz;
            }

            public int getColor() {
                return color;
            }

            public void setColor(int color) {
                this.color = color;
            }

            public String getPhotoArray() {
                return photoArray;
            }

            public void setPhotoArray(String photoArray) {
                this.photoArray = photoArray;
            }
        }
    }
}
