package com.example.learnstockmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class finalTutorial extends AppCompatActivity {
    Button btnv1,bsicstck,tech,candle,swing,price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_tutorial);

        btnv1=findViewById(R.id.vd1);
        bsicstck=findViewById(R.id.basicstck);
        tech=findViewById(R.id.tech);
        candle=findViewById(R.id.candle);
        swing=findViewById(R.id.swingtradin);
        price= findViewById(R.id.pricevdo);

        btnv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=p7HKvqRI_Bo"));
                startActivity(intent);
            }
        });

        bsicstck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=Xn7KWR9EOGQ"));
                startActivity(intent);
            }
        });

        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=eynxyoKgpng"));
                startActivity(i);
            }
        });

        candle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=C3KRwfj9F8Q"));
                startActivity(i);
            }
        });

        swing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=QUFAaWw3kU0"));
                startActivity(i);
            }
        });

        price.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=gBoq7jLd6ec"));
                startActivity(i);
            }
        });
    }
}