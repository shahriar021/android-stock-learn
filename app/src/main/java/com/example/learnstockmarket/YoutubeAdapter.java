package com.example.learnstockmarket;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class YoutubeAdapter extends RecyclerView.Adapter<youTubevieewholder> {
    ArrayList<DataSet> arrayList;
    Context context;

    public YoutubeAdapter(ArrayList<DataSet> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public youTubevieewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.video_per_row,parent,false);
        return new youTubevieewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull youTubevieewholder holder, int position) {
        DataSet current = arrayList.get(position);
        holder.webView.loadUrl(current.getLink());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,videoFullscreen.class);
                i.putExtra("link",current.getLink());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
