package com.example.learnstockmarket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.learnstockmarket.databinding.ActivityBasicinfoBinding;
import com.example.learnstockmarket.databinding.ActivityMainBinding;

import java.util.ArrayList;


public class basicinfo extends AppCompatActivity {

    @NonNull ActivityBasicinfoBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBasicinfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] name={"what is stock?","what is stock?","what is stock?","what is stock?","what is stock?","what is stock?",};
        String[] lastmessage={"money money money","money money money","money money money","money money money","money money money","money money money",};
        String[] country ={"bsjkhfgskjhf ksjhf","bsjkhfgskjhf ksjhf","bsjkhfgskjhf ksjhf","bsjkhfgskjhf ksjhf","bsjkhfgskjhf ksjhf","bsjkhfgskjhf ksjhf",};


        ArrayList<User> userArrayList = new ArrayList<>();
        for (int i=0;i<5;i++){
            User user = new User(name[i],lastmessage[i],country[i]);
            userArrayList.add(user);
        }

        ListAdapter listAdapter = new listAdapter(basicinfo.this,userArrayList);

        binding.basiclistview.setAdapter(listAdapter);
        binding.basiclistview.setClickable(true);
        binding.basiclistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(basicinfo.this,basicuser.class);
                i.putExtra("name",name[position]);
                i.putExtra("lastmessage",lastmessage[position]);
                i.putExtra("coutry",country[position]);
                startActivity(i);

            }
        });
    }
}