package com.emse.projetmobiledsc2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NameViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewName;
    public NameViewHolder(View itemView) {
        super(itemView);
        textViewName= (TextView)itemView.findViewById(R.id.item_list);
    }
    public void setContent(String name){
        textViewName.setText(name);
    }
}
