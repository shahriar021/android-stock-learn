package com.example.learnstockmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class dashboard extends AppCompatActivity {
    Button btninvs,btntr,btnmn,btncl;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);



        btncl = findViewById(R.id.buttoncl);
        btninvs = findViewById(R.id.buttoninv);
        btntr = findViewById(R.id.buttontr);
        btnmn = findViewById(R.id.buttonmnd);

        btninvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dashboard.this,invest_list.class);
                startActivity(i);
            }
        });

    }


}