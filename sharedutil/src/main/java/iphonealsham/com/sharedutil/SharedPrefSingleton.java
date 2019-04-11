package iphonealsham.com.sharedutil;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by ahmadsalman on 4/12/19.
 */

public class SharedPrefSingleton {

    private SharedPreferences prefs;
    private static SharedPrefSingleton instance;
    private static String filename = "NameFile";

    private SharedPrefSingleton(Context context) {
        prefs = context.getSharedPreferences(filename, Activity.MODE_PRIVATE);
    }

    public static SharedPrefSingleton getInstance() {
        return instance;
    }

    public static void init(Context context) {
        if (instance == null) {
            instance = new SharedPrefSingleton(context);
        }
    }

    public SharedPreferences getPrefs() {
        return prefs;
    }


}

