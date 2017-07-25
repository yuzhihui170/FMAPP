package com.apical.apicalradio;

import android.content.Context;
import android.content.SharedPreferences;

public class SPUtils {


    private static final String SHARED_PREFERENCES_NAME="my_share_preferences";

    public static void saveConfig(Context context, String key, String value) {
            SharedPreferences preferences = context.getSharedPreferences(
                    SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString(key, value);
            editor.commit();
    }
    public static String getConfig(Context context, String key, String def) {
        SharedPreferences preferences = context.getSharedPreferences(
                SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE);
        String value = preferences.getString(key, def);
        return value;
    }

    //电台的频道列表
    public static final String CHANNEL1="";

}
