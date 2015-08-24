package com.saturnup.sdk.sample.android;

import android.app.Application;

import com.saturnup.sdk.Saturnup;

public class SampleApplication extends Application {

    @Override
    public void onCreate() {
        Saturnup.initialize(this, "YOUR_API_KEY");
    }

}
