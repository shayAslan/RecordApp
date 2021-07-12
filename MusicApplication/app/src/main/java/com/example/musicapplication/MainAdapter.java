package com.example.musicapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder>
{

    private final boolean showMain;
    ArrayList arrayList;

    public MainAdapter(ArrayList arrayList, boolean showMain) {
        this.arrayList = arrayList;
        this.showMain = showMain;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        int id = showMain ? R.layout.my_story_item_layout : R.layout.normal_discovery_layout;
        View view= LayoutInflater.from(parent.getContext()).inflate(id,parent,false);


        return new MainAdapter.ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
