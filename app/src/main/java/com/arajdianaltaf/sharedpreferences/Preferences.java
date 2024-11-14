package com.arajdianaltaf.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preferences {
    public static final String KEY_AUTO_UPDATE = "auto_update";
    public static final String KEY_SYNC_DATA = "sync_data";
    public static final String KEY_NOTIFICATIONS = "notifications";
    public static final String KEY_DARK_MODE = "dark_mode";
    public static final String KEY_USAGE_DATA = "usage_data";

    private static SharedPreferences getSharedPreference(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void setKeyAutoUpdate(Context context, boolean value) {
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putBoolean(KEY_AUTO_UPDATE, value);
        editor.apply();
    }

    public static boolean getKeyAutoUpdate(Context context) {
        return getSharedPreference(context).getBoolean(KEY_AUTO_UPDATE, false);
    }

    public static void setKeySyncData(Context context, boolean value) {
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putBoolean(KEY_SYNC_DATA, value);
        editor.apply();
    }

    public static boolean getKeySyncData(Context context) {
        return getSharedPreference(context).getBoolean(KEY_SYNC_DATA, false);
    }

    public static void setKeyNotifications(Context context, boolean value) {
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putBoolean(KEY_NOTIFICATIONS, value);
        editor.apply();
    }

    public static boolean getKeyNotifications(Context context) {
        return getSharedPreference(context).getBoolean(KEY_NOTIFICATIONS, false);
    }

    public static void setKeyDarkMode(Context context, boolean value) {
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putBoolean(KEY_DARK_MODE, value);
        editor.apply();
    }

    public static boolean getKeyDarkMode(Context context) {
        return getSharedPreference(context).getBoolean(KEY_DARK_MODE, false);
    }

    public static void setKeyUsageData(Context context, boolean value) {
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putBoolean(KEY_USAGE_DATA, value);
        editor.apply();
    }

    public static boolean getKeyUsageData(Context context) {
        return getSharedPreference(context).getBoolean(KEY_USAGE_DATA, false);
    }
}
