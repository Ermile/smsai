package com.ermile.payamres.Function.SaveDataUser;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

public class SaveManager extends ContextWrapper {

    SharedPreferences.Editor editor;
    SharedPreferences sharedPreferences;
    public static final String SH_PREF_NAME = "ShPerfManager_Payamres";


    @SuppressLint("CommitPrefEdits")
    private SaveManager(Context context) {
        super(context);
        sharedPreferences = getSharedPreferences(SH_PREF_NAME, MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }
    public static SaveManager get(Context context) {
        return new SaveManager(context);
    }



    /** User Data */
    public static final String firstOpen = "first";
    public static final String permissionSMS = "permissionSMS";
    public static final String numberPhone = "number";
    public void save_UserData(boolean SmsPermission, boolean FirstOpenApp ,String NumberPhone) {
        editor.putBoolean(firstOpen, FirstOpenApp);
        editor.putBoolean(permissionSMS, SmsPermission);
        editor.putString(numberPhone, NumberPhone);
        editor.apply();
    }
    public Map<String, String> get_UserData() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(firstOpen, String.valueOf(sharedPreferences.getBoolean(firstOpen, false )));
        hashMap.put(permissionSMS, String.valueOf(sharedPreferences.getBoolean(permissionSMS, false )));
        hashMap.put(numberPhone, sharedPreferences.getString(numberPhone, null ));
        return hashMap;
    }

    /** Total Day*/
    public static final String day_Receive = "day_R";
    public static final String day_Send = "day_S";
    public void save_Day(String receive ,String send) {
        editor.putString(day_Receive, receive);
        editor.putString(day_Send, send);
        editor.apply();
    }
    public Map<String, String> get_Day() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(day_Receive, sharedPreferences.getString(day_Receive, null ));
        hashMap.put(day_Send, sharedPreferences.getString(day_Send, null ));
        return hashMap;
    }

    /** Total Week*/
    public static final String week_Receive = "week_R";
    public static final String week_Send = "week_S";
    public void save_week(String receive ,String send) {
        editor.putString(week_Receive, receive);
        editor.putString(week_Send, send);
        editor.apply();
    }
    public Map<String, String> get_week() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(week_Receive, sharedPreferences.getString(week_Receive, null ));
        hashMap.put(week_Send, sharedPreferences.getString(week_Send, null ));
        return hashMap;
    }

    /** Total Month*/
    public static final String month_Receive = "month_R";
    public static final String month_Send = "month_S";
    public void save_month(String receive ,String send) {
        editor.putString(month_Receive, receive);
        editor.putString(month_Send, send);
        editor.apply();
    }
    public Map<String, String> get_month() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(month_Receive, sharedPreferences.getString(month_Receive, null ));
        hashMap.put(month_Send, sharedPreferences.getString(month_Send, null ));
        return hashMap;
    }

    /** Total All*/
    public static final String all_Receive = "all_R";
    public static final String all_Send = "all_S";
    public void save_all(String receive ,String send) {
        editor.putString(all_Receive, receive);
        editor.putString(all_Send, send);
        editor.apply();
    }
    public Map<String, String> get_all() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(all_Receive, sharedPreferences.getString(all_Receive, null ));
        hashMap.put(all_Send, sharedPreferences.getString(all_Send, null ));
        return hashMap;
    }



}
