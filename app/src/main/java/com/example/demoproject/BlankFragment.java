package com.example.demoproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.demoproject.databinding.FragmentBlankBinding;

import java.util.ArrayList;


public class BlankFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentBlankBinding fragmentBlankBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_blank, container, false);
        View view = fragmentBlankBinding.getRoot();
        ArrayList<User> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new User(i, "Tuan", 20 + i));
        }
        fragmentBlankBinding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        UserAdapter userAdapter = new UserAdapter(list, getActivity());
        fragmentBlankBinding.recyclerView.setAdapter(userAdapter);
        return view;
    }
}