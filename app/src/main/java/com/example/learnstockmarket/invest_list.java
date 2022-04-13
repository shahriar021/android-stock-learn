package com.example.learnstockmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class invest_list extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    Adapter adapter;
    List<model> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invest_list);

        initData();
        inRecycleview();
    }

    private void initData() {
        userList=new ArrayList<>();
        userList.add(new model("what is stock market ?","know here ,u wanna be rich ,invest right now,or do some trading"));
        userList.add(new model("how to choose best stock?","know here ,u wanna be rich ,invest right now,or do some trading"));
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