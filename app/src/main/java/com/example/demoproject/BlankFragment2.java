package com.example.demoproject;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.demoproject.databinding.FragmentBlank2Binding;

import java.util.Calendar;


public class BlankFragment2 extends Fragment {

    // not comment
    @SuppressLint("ResourceType")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentBlank2Binding binding = FragmentBlank2Binding.inflate(inflater, container, false);
        View view = binding.getRoot();
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                Toast.makeText(getActivity(), year + "/ " + month + "/" + day, Toast.LENGTH_SHORT).show();
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, month);
                calendar.set(Calendar.DAY_OF_MONTH, day);
            }
        };
        binding.btnPreviewFragment.setOnClickListener(i -> {
            binding.imageView.setImageResource(R.drawable.astronaut);
            new DatePickerDialog(getActivity(), dateSetListener, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH)
                    , calendar.get(Calendar.DAY_OF_MONTH)).show();
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