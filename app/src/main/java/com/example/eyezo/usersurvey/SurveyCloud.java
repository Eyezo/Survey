package com.example.eyezo.usersurvey;

import android.app.Application;

import com.backendless.Backendless;

public class SurveyCloud extends Application {

    private static final String APPLICATION_ID = "7D045370-0C90-5D16-FF1A-9E42D2B50E00";
    private static final String API_KEY = "B78927A6-B7A5-4055-8897-FA4FB472A63B";
    private static final String SERVER_URL = "https://api.backendless.com";

    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(),APPLICATION_ID,API_KEY);
    }
}
