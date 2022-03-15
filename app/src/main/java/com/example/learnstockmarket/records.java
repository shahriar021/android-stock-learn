package com.example.learnstockmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class records extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6,e7;
    TextView t1;
    Button b1;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);

        e1=findViewById(R.id.idbo);
        e2=findViewById(R.id.idstockname);
        e3=findViewById(R.id.idquntity);
        e4=findViewById(R.id.idbyngprc);
        e5=findViewById(R.id.idsellingprice);
        //e6=findViewById(R.id.spinner);
        e7=findViewById(R.id.profitloss);

        t1=findViewById(R.id.tx1);

        b1=findViewById(R.id.savebtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Apdatabase db = Room.databaseBuilder(getApplicationContext(),
                        Apdatabase.class, "roomdb").build();
                UDao userDao =db.userDao();
                userDao.insertrecrd(new User(Integer.parseInt(e1.getText().toString()),e2.getText().toString(),e3.getText().toString(),e4.getText().toString(),e5.getText().toString(),e7.getText().toString()));
                e1.setText("");
                e2.setText("");
                t1.setText("inserted successfully");
            }
        });




        /*Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.types, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);*/
    }


}