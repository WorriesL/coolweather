package com.coolweather.android.coolweather.gson;

/**
 * Created by 刘力伟 on 2018/12/12.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
