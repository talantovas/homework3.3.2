package com.geeks.homework332;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FirstFragment extends Fragment {


    private RecyclerView rvCars;
    private ArrayList<String> carsList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvCars = requireActivity().findViewById(R.id.cars);
        loadData();
        CarsAdapter adapter = new CarsAdapter(carsList);
        rvCars.setAdapter(adapter);
    }
    private void loadData(){
        carsList.add("Mercedes Benz");
        carsList.add("BMW");
        carsList.add("Toyota");
        carsList.add("Lexus");
        carsList.add("Porsche");
        carsList.add("Ford");
        carsList.add("Kia");
        carsList.add("Audi");
        carsList.add("Hyundai");
        carsList.add("Lamborghini");
        carsList.add("Nissan");
        carsList.add("Maserati");
        carsList.add("Rolls-Royce");
    }
}