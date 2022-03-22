package com.example.learnstockmarket;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.learnstockmarket.db.AppDatabase;
import com.example.learnstockmarket.db.User;

import java.util.List;

public class records extends AppCompatActivity {
    Button addNewuserbtn;

    private UserListAdapter userListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);
        addNewuserbtn=findViewById(R.id.addbtn);
        addNewuserbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(records.this,AddnewUser.class),100);

            }
        });

        initRecycleView();
        loadUserList();





    }

    private void initRecycleView(){
        RecyclerView recyclerView = findViewById(R.id.recylerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
        userListAdapter = new UserListAdapter(this);
        recyclerView.setAdapter(userListAdapter);
    }

    private void loadUserList(){
        AppDatabase db=AppDatabase.getDbInstance(this.getApplicationContext());
        List<User> userList= db.userDao().getAllUsers();
        userListAdapter.setUserList(userList);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 100){
            loadUserList();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }


}