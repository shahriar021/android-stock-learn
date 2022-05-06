package com.example.learnstockmarket;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<model> userList;
    public Adapter(List<model> userList){
        this.userList=userList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.invest_list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        String nam= userList.get(position).getTextv1();
        String det=userList.get(position).getTextv2();

        holder.setData(nam,det);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textView1;
        private TextView textView2;

        public ViewHolder(View itemView){
            super(itemView);
            textView1=itemView.findViewById(R.id.t1);
            textView2=itemView.findViewById(R.id.t2);
        }

        public void setData(String nam, String det) {
            textView1.setText(nam);
            textView2.setText(det);
        }
    }
}
