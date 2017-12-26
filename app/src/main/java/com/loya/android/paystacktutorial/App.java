package com.loya.android.paystacktutorial;

import android.app.Application;

import co.paystack.android.PaystackSdk;

/**
 * Created by user on 11/21/2017.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        PaystackSdk.initialize(getApplicationContext());
    }
}