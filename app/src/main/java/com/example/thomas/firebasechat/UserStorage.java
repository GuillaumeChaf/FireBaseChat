package com.example.thomas.firebasechat;

import android.content.SharedPreferences;
import android.content.Context;
import android.preference.PreferenceManager;

public class UserStorage {

    public static final String USER_NAME = "login";
    public static final String USER_EMAIL = "email";


    public static User getUser(Context context){

        SharedPreferences P = PreferenceManager.getDefaultSharedPreferences(context);
        return new User(P.getString(USER_NAME,"undefined"),P.getString(USER_EMAIL,"undefined"));
    }

    public static void saveUserInfo(Context context, String name, String email) {

        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor.putString(USER_NAME, name);
        editor.putString(USER_EMAIL, email);
        editor.apply();
    }

}
