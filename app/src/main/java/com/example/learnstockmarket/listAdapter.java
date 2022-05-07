package com.example.learnstockmarket;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class listAdapter extends ArrayAdapter<User> {

    public listAdapter(Context context, ArrayList<User> userArrayList){
        super(context,R.layout.blistitem,userArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        User user = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.blistitem,parent,false);
        }

        TextView tv1 = convertView.findViewById(R.id.btxt1);
        TextView tv2 = convertView.findViewById(R.id.btxt2);

        tv1.setText(user.name);
        tv2.setText(user.lastmesage);

        return convertView;
    }
}
