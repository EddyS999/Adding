package com.example.adding;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView nom2, date2, realisateur2;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        nom2 = itemView.findViewById(R.id.nom2);
        date2 = itemView.findViewById(R.id.date2);
        realisateur2 = itemView.findViewById(R.id.realisateur2);
    }
}
