package com.example.learnstockmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Basic extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        ListView listview =findViewById(R.id.basiclistviewid);
        ArrayList<String> basiclist = new ArrayList<>();
        basiclist.add("bhindi");
        basiclist.add("kodu");
        basiclist.add("begun");
        basiclist.add("alu");
        basiclist.add("lau");
        basiclist.add("what is stock??\n"+"it is hklughukshgh!");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,basiclist);
        listview.setAdapter(arrayAdapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text="Item"+position+" "+((TextView)view).getText().toString();
                Toast.makeText(Basic.this, text, Toast.LENGTH_SHORT).show();
            }
        });
    }



    }
