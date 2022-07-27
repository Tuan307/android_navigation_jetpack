package com.example.demoproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demoproject.databinding.RecyItemBinding;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private List<User> list;
    private Context context;

    public UserAdapter(List<User> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        RecyItemBinding recyItemBinding = RecyItemBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(recyItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User user = list.get(position);
        if (user == null) {
            return;
        }
        holder.recyItemBinding.setUser(user);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RecyItemBinding recyItemBinding;

        public ViewHolder(@NonNull RecyItemBinding binding) {
            super(binding.getRoot());
            this.recyItemBinding = binding;
        }
    }
}
