package com.example.learnstockmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    Adapter adapter;
    List<model> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        inRecycleview();

        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this,dashboard.class);
                startActivity(i);


            }
        },4000);
    }

    private void initData() {
        userList=new ArrayList<>();
        userList.add(new model("what is stock market ?","know here ,u wanna be rich ,invest right now,or do some trading"));
        userList.add(new model("what is stock market ?","know here ,u wanna be rich ,invest right now,or do some trading"));
        userList.add(new model("what is stock market ?","know here ,u wanna be rich ,invest right now,or do some trading"));
        userList.add(new model("what is stock market ?","know here ,u wanna be rich ,invest right now,or do some trading"));
        userList.add(new model("what is stock market ?","know here ,u wanna be rich ,invest right now,or do some trading"));
        userList.add(new model("what is stock market ?","know here ,u wanna be rich ,invest right now,or do some trading"));
        userList.add(new model("what is stock market ?","know here ,u wanna be rich ,invest right now,or do some trading"));
        userList.add(new model("what is stock market ?","know here ,u wanna be rich ,invest right now,or do some trading"));
        userList.add(new model("what is stock market ?","know here ,u wanna be rich ,invest right now,or do some trading"));
        userList.add(new model("what is stock market ?","know here ,u wanna be rich ,invest right now,or do some trading"));
        userList.add(new model("what is stock market ?","know here ,u wanna be rich ,invest right now,or do some trading"));
        userList.add(new model("what is stock market ?","know here ,u wanna be rich ,invest right now,or do some trading"));
        userList.add(new model("what is stock market ?","know here ,u wanna be rich ,invest right now,or do some trading"));
        userList.add(new model("what is stock market ?","know here ,u wanna be rich ,invest right now,or do some trading"));
        userList.add(new model("what is stock market ?","know here ,u wanna be rich ,invest right now,or do some trading"));
        userList.add(new model("what is stock market ?","know here ,u wanna be rich ,invest right now,or do some trading"));
        userList.add(new model("what is stock market ?","know here ,u wanna be rich ,invest right now,or do some trading"));
    }

    private void inRecycleview() {
        recyclerView =findViewById(R.id.recyclerview);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}