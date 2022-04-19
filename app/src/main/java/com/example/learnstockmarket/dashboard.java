package com.example.learnstockmarket;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class dashboard extends AppCompatActivity {
    Button btninvs,btntrader,btnmn,btncl,btncalculator,buttonrecords,buttontutorial,btnbasic;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().hide();

        //LinearLayout linearLayout = (LinearLayout)  findViewById(R.id.buttoninv);
        Button button1 = findViewById(R.id.buttoninv);
        AnimationDrawable animationDrawable= (AnimationDrawable) button1.getBackground();

        Button button2 = findViewById(R.id.buttoninv);
        AnimationDrawable animationDrawable2= (AnimationDrawable) button2.getBackground();

        ConstraintLayout c = findViewById(R.id.constraint);
        AnimationDrawable animationDrawable3= (AnimationDrawable) c.getBackground();


        animationDrawable2.setEnterFadeDuration(2500);
        animationDrawable2.setExitFadeDuration(5000);

        animationDrawable2.start();

        animationDrawable.setEnterFadeDuration(500);
        animationDrawable.setExitFadeDuration(1000);

        animationDrawable.start();

        animationDrawable3.setEnterFadeDuration(500);
        animationDrawable3.setExitFadeDuration(1000);

        animationDrawable3.start();




        btninvs = findViewById(R.id.buttoninv);
        btntrader = findViewById(R.id.buttontrader);
        btncalculator= findViewById(R.id.buttoncalculator);
        buttonrecords=findViewById(R.id.buttonrecrds);
        buttontutorial=findViewById(R.id.buttontutorial);
        btnbasic=findViewById(R.id.buttonbsc);


        btninvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dashboard.this,invest_list.class);
                startActivity(i);
            }
        });

        btntrader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dashboard.this,trader_activity.class);
                startActivity(i);
            }
        });

        btncalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dashboard.this,calculator.class);
                startActivity(i);
            }
        });

        buttonrecords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(dashboard.this,records.class);
                startActivity(i);
            }
        });

        buttontutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(dashboard.this,tutorial.class);
                startActivity(intent);
            }
        });

        btnbasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(dashboard.this,Basic.class);
                startActivity(i);
            }
        });


    }


}