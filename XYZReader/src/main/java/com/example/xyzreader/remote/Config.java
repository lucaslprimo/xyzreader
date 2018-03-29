package com.example.xyzreader.remote;

import android.content.Context;
import android.net.ConnectivityManager;

import java.net.MalformedURLException;
import java.net.URL;

public class Config{
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://nspf.github.io/XYZReader/data.json" );
        } catch (MalformedURLException exception) {

            exception.printStackTrace();
        }

        BASE_URL = url;
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null;
    }
}
