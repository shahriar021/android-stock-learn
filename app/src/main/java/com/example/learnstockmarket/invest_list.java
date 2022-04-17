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
        userList.add(new model("Rule 1","Bulls, Bears Make Money, Pigs Get Slaughtered . "));
        userList.add(new model("Rule 2","It's OK to Pay the Taxes"));
        userList.add(new model("Rule 3","Don't Buy All at Once"));
        userList.add(new model("Rule 4","Buy Damaged Stocks, Not Damaged Companies"));
        userList.add(new model("Rule 5","Diversify to Control Risk"));
        userList.add(new model("Rule 6","Do Your Stock Homework"));
        userList.add(new model("Rule 7","No One Made a Dime by Panicking"));
        userList.add(new model("Rule 8","Buy Best-of-Breed Companies"));
        userList.add(new model("Rule 9","Defend Some Stocks, Not All"));
        userList.add(new model("Rule 10","Bad Buys Won't Become Takeovers"));
        userList.add(new model("Rule 11","Don't Own Too Many Names"));
        userList.add(new model("Rule 12","Cash Is for Winners"));
        userList.add(new model("Rule 13","Expect, Don't Fear Corrections"));
        userList.add(new model("Rule 14","Never Subsidize Losers With Winners"));
        userList.add(new model("Rule 15","Beware of Wall Street Hype"));
        userList.add(new model("Rule 16","There's Always a Bull Market"));
        userList.add(new model("Rule 17","Be Flexible"));
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