package com.emse.projetmobiledsc2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class NameListAdapter extends RecyclerView.Adapter<NameViewHolder> {
    List<String> nameList;
    public NameListAdapter(){
        nameList=new ArrayList<>();
    }
    @Override
    //hal method mn 3ayetla kell marra bde 3ayyit lal holder (nb of elements viewed)
    public NameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name,parent,false);
        return new NameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NameViewHolder holder, int position) {
        holder.setContent(nameList.get(position));
    }

    @Override
    public int getItemCount() {

        return nameList.size();
    }
    public void updateData(List<String> nameList){
        this.nameList.clear();
        this.nameList.addAll(nameList);
        notifyDataSetChanged(); // pr dire au adapter de refaire ts es nvx calculs
    }
}
