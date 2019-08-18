package com.example.coolweather.gson;


import com.google.gson.annotations.SerializedName;

public class AQI {
    public AQICity city;
    public class AQICity{

        @SerializedName("aqi")
        public String aqi;
        @SerializedName("pm25")
        public String pm25;
    }
}
