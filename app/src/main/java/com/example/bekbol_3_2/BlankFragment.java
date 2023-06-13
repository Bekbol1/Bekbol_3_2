package com.example.bekbol_3_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class BlankFragment extends Fragment {

    private Button btnIncrease;
    private Button btnReduce;
    private TextView tvMeaning;
    private Integer value = 0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnIncrease = requireActivity().findViewById(R.id.btn_increase);
        btnReduce = requireActivity().findViewById(R.id.btn_reduce);
        tvMeaning = requireActivity().findViewById(R.id.tv_meaning);
        tvMeaning.setText (String.valueOf(value));

        btnReduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
value--;
tvMeaning.setText(String.valueOf(value));
            }
        });


        btnIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value++;
                tvMeaning.setText(String.valueOf(value));
            }
        });
    }
}