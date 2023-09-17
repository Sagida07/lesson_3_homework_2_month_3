package com.example.lesson_3_homework_2_month_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CelebrityViewHolder extends RecyclerView.ViewHolder {
    private TextView tvTitle;

    public CelebrityViewHolder(@NonNull View itemView) {
        super(itemView);
        tvTitle = itemView.findViewById(R.id.tv_title);
    }

    public void  bind(String celebrityName){
        tvTitle.setText(celebrityName);
    }
}
