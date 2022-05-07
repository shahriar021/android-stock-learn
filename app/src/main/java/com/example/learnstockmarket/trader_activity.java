package com.example.learnstockmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class trader_activity extends AppCompatActivity {
    Button btn1,swing,candle,intraday;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trader);

        LinearLayout l = findViewById(R.id.lntrd);
        AnimationDrawable animationDrawable4= (AnimationDrawable) l.getBackground();


        animationDrawable4.setEnterFadeDuration(2500);
        animationDrawable4.setExitFadeDuration(5000);

        animationDrawable4.start();

        btn1 =findViewById(R.id.btn_1);
        swing = findViewById(R.id.swing);
        candle = findViewById(R.id.candlestick);
        intraday = findViewById(R.id.intraday);
        textView = findViewById(R.id.text1);
        textView.setSelected(true);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(trader_activity.this,dashboard.class);
                startActivity(i);

            }
        });

        swing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(trader_activity.this,swing.class);
                startActivity(i);
            }
        });

        candle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(trader_activity.this,candle.class);
                startActivity(i);
            }
        });

        intraday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(trader_activity.this,trdrintraday.class);
                startActivity(i);
            }
        });
    }
}