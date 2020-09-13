package com.lzw.androidsample.data;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.lzw.androidsample.R;

class MyViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    TextView textView2;

    public MyViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.text);
        textView2 = itemView.findViewById(R.id.text2);
    }

}