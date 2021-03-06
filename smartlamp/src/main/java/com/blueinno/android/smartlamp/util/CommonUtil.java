package com.blueinno.android.smartlamp.util;

import android.util.Log;

/**
 * Created by rrobbie on 16. 3. 28..
 */
public class CommonUtil {

    public static String getProgress(int value) {
        return "밝기 설정 (" + value * 20 + "%)";
    }

    //  =======================================================================================

    public static int getTimeSecond(int value) {
        int now = value - (int)(System.currentTimeMillis()/60000);
        Log.e("rrobbie", "time : " + value + " / " + System.currentTimeMillis() );
        int result = (now * 1000);
        return result > 0 ? result : 0;
    }

    public static String getTime(int value) {
        return (value > 9) ? "" + value : "0" + value;
    }

    public static String getTimeFormat(int value) {
        int hour = value / 60;
        int minute = value % 60;
        int hourDay = hour > 12 ? hour - 12 : hour;
        String temp = hour > 12 ? "PM" : "AM";
        return temp + " " + getTime(hourDay) + " : " + getTime(minute);
    }


}
