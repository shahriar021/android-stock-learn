package com.example.learnstockmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.learnstockmarket.databinding.ActivityBasicuserBinding;

public class basicuser extends AppCompatActivity {

    ActivityBasicuserBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding  = ActivityBasicuserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent i = this.getIntent();

        if (i != null){
            String name=i.getStringExtra("name");
            String lastmessage=i.getStringExtra("lastmessage");
            String coutry=i.getStringExtra("coutry");

            binding.bcusertextView.setText(name);
            binding.bcusertextView2.setText(lastmessage);
            binding.bcusertextView3.setText(coutry);

        }
    }
}