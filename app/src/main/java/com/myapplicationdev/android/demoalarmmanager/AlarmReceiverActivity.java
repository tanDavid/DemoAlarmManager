package com.myapplicationdev.android.demoalarmmanager;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.TextView;

public class AlarmReceiverActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_receiver);

        tv = findViewById(R.id.textView);

        Log.d("TAG", tv.getText().toString());

    }


}