package com.dasweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/4/1.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
    public Update update;
}
