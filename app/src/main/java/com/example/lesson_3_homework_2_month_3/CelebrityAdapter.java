package com.example.lesson_3_homework_2_month_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CelebrityAdapter extends RecyclerView.Adapter<CelebrityViewHolder> {

    private ArrayList<String> celebrityList;

    public CelebrityAdapter(ArrayList<String> celebrityList) {
        this.celebrityList = celebrityList;
    }

    @NonNull
    @Override
    public CelebrityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CelebrityViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_celebrity, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CelebrityViewHolder holder, int position) {
        holder.bind(celebrityList.get(position));
    }

    @Override
    public int getItemCount() {
        return celebrityList.size();
    }
}
