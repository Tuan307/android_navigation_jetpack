package com.example.demoproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.demoproject.databinding.FragmentBlank2Binding;


public class BlankFragment2 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentBlank2Binding binding = FragmentBlank2Binding.inflate(inflater, container, false);
        View view = binding.getRoot();
        binding.btnChangeFragment.setOnClickListener(i -> {
        });
        return view;
    }
}