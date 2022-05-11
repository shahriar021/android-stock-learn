package com.example.learnstockmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.ArrayList;

public class tutorial extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<DataSet> arrayList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        recyclerView=findViewById(R.id.recycer_view_yourube);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        arrayList=new ArrayList<DataSet>();

        DataSet dataSet=new DataSet("https://www.youtube.com/watch?v=gXWXKjR-qII&t=81s");
        arrayList.add(dataSet);
         dataSet=new DataSet("https://www.youtube.com/watch?v=gXWXKjR-qII&t=81s");
        arrayList.add(dataSet);
        dataSet=new DataSet("https://www.youtube.com/watch?v=gXWXKjR-qII&t=81s");
        arrayList.add(dataSet);
        dataSet=new DataSet("https://www.youtube.com/watch?v=gXWXKjR-qII&t=81s");
        arrayList.add(dataSet);
        dataSet=new DataSet("https://www.youtube.com/watch?v=gXWXKjR-qII&t=81s");
        arrayList.add(dataSet);
        dataSet=new DataSet("https://www.youtube.com/watch?v=gXWXKjR-qII&t=81s");
        arrayList.add(dataSet);

        YoutubeAdapter youtubeAdapter = new YoutubeAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(youtubeAdapter);
    }
}