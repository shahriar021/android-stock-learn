package com.example.learnstockmarket;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/*public class basicAdapter extends RecyclerView.Adapter<Adapter.ViewHolder2> {

    private List<bascimodel> basicList;

    public basicAdapter(List<bascimodel> basicList) {
        this.basicList = basicList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder2 onCreateViewHolder2(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.basiclistitemdesign,parent,false);
        return new ViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder2 holder, int position) {
        String basittext1=basicList.get(position).getTextviewbs1();
        String basictext2=basicList.get(position).getTextviewbs2();

        holder.setData(basittext1,basictext2);


    }

    @Override
    public int getItemCount() {
        return basicList.size();
    }

    public class Viewholder2 extends RecyclerView.ViewHolder2{

        private TextView bastext1;
        private TextView bstext2;


        public Viewholder2(@NonNull View itemView) {
            super(itemView);

            bastext1=itemView.findViewById(R.id.btxt1);
            bstext2=itemView.findViewById(R.id.btxt2);
        }
    }
}*/
