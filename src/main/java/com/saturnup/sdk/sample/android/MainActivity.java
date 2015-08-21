package com.saturnup.sdk.sample.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // A simple button to show an advertisement
        Button sampleButton = (Button) findViewById(R.id.button_show_ad);
        sampleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAd();
            }
        });
    }

    private void showAd() {

    }

}
