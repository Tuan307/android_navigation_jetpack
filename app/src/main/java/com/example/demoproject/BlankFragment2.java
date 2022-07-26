package com.example.demoproject;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.demoproject.databinding.FragmentBlank2Binding;


public class BlankFragment2 extends Fragment {


    @SuppressLint("ResourceType")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentBlank2Binding binding = FragmentBlank2Binding.inflate(inflater, container, false);
        View view = binding.getRoot();
        binding.btnPreviewFragment.setOnClickListener(i -> {
            binding.imageView.setImageResource(R.drawable.astronaut);
        });
        binding.btnChangeFragment.setOnClickListener(i -> {
            CustomViewDialog customViewDialog = new CustomViewDialog();
            customViewDialog.showDialog(getActivity(), "This is a normal message for a normal custom dialog");
            WallpaperManager wallpaperManager = WallpaperManager.getInstance(getActivity());
            try {
                wallpaperManager.setResource(R.drawable.astronaut);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        return view;
    }
}