package com.geeks.homework332;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarsAdapter extends RecyclerView.Adapter<CarsViewHolder> {

    private ArrayList<String> carsList;

    public CarsAdapter(ArrayList<String> carsList){
        this.carsList = carsList;
    }
    @NonNull
    @Override
    public CarsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cars,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarsViewHolder holder, int position) {
        holder.onBind(carsList.get(position));
    }

    @Override
    public int getItemCount() {
        return carsList.size();
    }
}

