package com.example.learnstockmarket;

import android.view.View;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class youTubevieewholder extends RecyclerView.ViewHolder {
    WebView webView;
    Button button;
    public youTubevieewholder(@NonNull View itemView) {
        super(itemView);
        webView=itemView.findViewById(R.id.video_view);
        button=itemView.findViewById(R.id.recycer_view_yourube);
    }
}
