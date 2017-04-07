package navychang.www.netlibrary.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by navychang on 17/3/17.
 */

public class LoginGson {


        /**
         * 18651694553 : 9218
         * lasttime : {"time":1489721136283,"minutes":25,"seconds":36,"hours":11,"month":2,"year":117,"timezoneOffset":-480,"day":5,"date":17}
         * code : 9218
         */

        @SerializedName("18651694553")
        private int _$18651694553;
        private LasttimeBean lasttime;
        private String code;

        public int get_$18651694553() {
            return _$18651694553;
        }

        public void set_$18651694553(int _$18651694553) {
            this._$18651694553 = _$18651694553;
        }

        public LasttimeBean getLasttime() {
            return lasttime;
        }

        public void setLasttime(LasttimeBean lasttime) {
            this.lasttime = lasttime;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public static class LasttimeBean {
            /**
             * time : 1489721136283
             * minutes : 25
             * seconds : 36
             * hours : 11
             * month : 2
             * year : 117
             * timezoneOffset : -480
             * day : 5
             * date : 17
             */

            private long time;
            private int minutes;
            private int seconds;
            private int hours;
            private int month;
            private int year;
            private int timezoneOffset;
            private int day;
            private int date;

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
