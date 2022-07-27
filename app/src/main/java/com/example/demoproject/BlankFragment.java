package com.example.demoproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.demoproject.databinding.FragmentBlankBinding;


public class BlankFragment extends Fragment {

    private BlankFragmentViewModel blankFragmentViewModel;

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
        blankFragmentViewModel = new ViewModelProvider(getActivity()).get(BlankFragmentViewModel.class);
        fragmentBlankBinding.setModel(blankFragmentViewModel);
        fragmentBlankBinding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

//        List<User> list = blankFragmentViewModel.initData();
//        UserAdapter userAdapter = new UserAdapter(list, getActivity());
//        fragmentBlankBinding.recyclerView.setAdapter(userAdapter);
        blankFragmentViewModel.getUsers();
        blankFragmentViewModel.getUserList().observe(getActivity(), users -> {
            UserAdapter userAdapter1 = new UserAdapter(users, getActivity());
            fragmentBlankBinding.recyclerView.setAdapter(userAdapter1);
        });

        return view;
    }
}