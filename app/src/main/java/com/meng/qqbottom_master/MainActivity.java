package com.meng.qqbottom_master;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ThreeDLayout tdAvatar = (ThreeDLayout) findViewById(R.id.td_main);
        tdAvatar.setTouchMode(ThreeDLayout.MODE_BOTH_X_Y);
        tdAvatar.setMaxRotateDegree(30);

        ThreeDLayout tdCenter = (ThreeDLayout) findViewById(R.id.td_center);
        tdCenter.setTouchMode(ThreeDLayout.MODE_BOTH_X_Y);
        tdCenter.setMaxRotateDegree(30);

        ThreeDLayout tdMind = (ThreeDLayout) findViewById(R.id.td_mind);
        tdMind.setTouchMode(ThreeDLayout.MODE_BOTH_X_Y);
        tdMind.setMaxRotateDegree(30);
    }
}
