package com.example.learnstockmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;

import com.example.learnstockmarket.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class basicinfo extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] name={"what is stock?","what is stock?","what is stock?","what is stock?","what is stock?","what is stock?",};
        String[] lastmessage={"money money money","money money money","money money money","money money money","money money money","money money money",};
        String[] country ={"bsjkhfgskjhf ksjhf","bsjkhfgskjhf ksjhf","bsjkhfgskjhf ksjhf","bsjkhfgskjhf ksjhf","bsjkhfgskjhf ksjhf","bsjkhfgskjhf ksjhf",};


        ArrayList<User> userArrayList = new ArrayList<>();
        /*for (int i=0;i<5;i++){
            User user = new User(name[i],lastmessage[i],country[i]);
            userArrayList.add(user);
        }*/

        ListAdapter listAdapter = new listAdapter(basicinfo.this,userArrayList);

        //binding..setAdapter(listAdapter);
    }
}