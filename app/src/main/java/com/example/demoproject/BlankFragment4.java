package com.example.demoproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demoproject.databinding.FragmentBlank4Binding;

public class BlankFragment4 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentBlank4Binding binding = FragmentBlank4Binding.inflate(inflater,container,false);
        View view = binding.getRoot();
        return view;
    }
}