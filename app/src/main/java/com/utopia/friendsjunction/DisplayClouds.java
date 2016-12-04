package com.utopia.friendsjunction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayClouds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_clouds);

        Intent intent = this.getIntent();
        //String uname = intent.getStringExtra(MainActivity.EXTRA_USERNAME);
        TextView textView = new TextView(this);
        textView.setTextSize(34);
        String welcomeMsg = String.format("Welcome Friend, Please Jump In to one of the Clouds.");
        textView.setText(welcomeMsg);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_clouds);
        layout.addView(textView);
    }
}
