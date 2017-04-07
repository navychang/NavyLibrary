package navychang.www.netlibrary.entity;

import java.util.List;

/**
 * Created by navychang on 16/12/1.
 */
public class SaiShiBean {


    /**
     * total : 100
     * activitys : [{"endtime":"2016-12-21 19:48","createuid":0,"firetime":"","photourl":"","begintime":"2016-12-21 19:35","ispass":1,"from":1,"aid":292,"juli":"","type":0,"curtime":"2016-12-01 16:40:12","isjoin":"","isDelete":0,"numbers":4,"description":"\u2026\u2026","name":"总测试","money":0,"hasmap":3,"groupid":"266985121649787304","lnt":"","mapfrom":0,"signEndtime":"","signBegintime":"","index":0,"mapaddress":"","url":"","num":0,"jlbid":1,"partyAddress":"\u2026\u2026","lot":""},{"endtime":"2017-06-16 09:58","createuid":0,"firetime":"","photourl":"","begintime":"2016-11-18 09:58","ispass":0,"from":1,"aid":271,"juli":"","type":0,"curtime":"2016-12-01 16:40:12","isjoin":"","isDelete":0,"numbers":2,"description":"？？？","name":"。。","money":0,"hasmap":0,"groupid":"264985567765201332","lnt":"","mapfrom":0,"signEndtime":"","signBegintime":"","index":0,"mapaddress":"","url":"","num":0,"jlbid":1,"partyAddress":"。。","lot":""}]
     */

    private int total;
    /**
     * endtime : 2016-12-21 19:48
     * createuid : 0
     * firetime :
     * photourl :
     * begintime : 2016-12-21 19:35
     * ispass : 1
     * from : 1
     * aid : 292
     * juli :
     * type : 0
     * curtime : 2016-12-01 16:40:12
     * isjoin :
     * isDelete : 0
     * numbers : 4
     * description : ……
     * name : 总测试
     * money : 0
     * hasmap : 3
     * groupid : 266985121649787304
     * lnt :
     * mapfrom : 0
     * signEndtime :
     * signBegintime :
     * index : 0
     * mapaddress :
     * url :
     * num : 0
     * jlbid : 1
     * partyAddress : ……
     * lot :
     */

    private List<ActivitysBean> activitys;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<ActivitysBean> getActivitys() {
        return activitys;
    }

    public void setActivitys(List<ActivitysBean> activitys) {
        this.activitys = activitys;
    }

    public static class ActivitysBean {
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
        private String isjoin;
        private int isDelete;
        private int numbers;
        private String description;
        private String name;
        private int money;
        private int hasmap;
        private String groupid;
        private String lnt;
        private int mapfrom;
        private String signEndtime;
        private String signBegintime;
        private int index;
        private String mapaddress;
        private String url;
        private int num;
        private int jlbid;
        private String partyAddress;
        private String lot;

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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMoney() {
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

        public String getLot() {
            return lot;
        }

        public void setLot(String lot) {
            this.lot = lot;
        }
    }
}
