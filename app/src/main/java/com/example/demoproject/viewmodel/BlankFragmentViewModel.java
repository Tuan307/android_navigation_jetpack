package com.example.demoproject.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.demoproject.model.User;
import com.example.demoproject.database.UserDatabase;

import java.util.ArrayList;
import java.util.List;

public class BlankFragmentViewModel extends AndroidViewModel {
    private UserDatabase userDatabase;
    private List<User> users;
    private MutableLiveData<List<User>> userList;

    public BlankFragmentViewModel(Application application) {
        super(application);
        userList = new MutableLiveData<>();
        userDatabase = UserDatabase.getInstance(application.getApplicationContext());
    }

    public MutableLiveData<List<User>> getUserList() {
        return userList;
    }

    public List<User> initData() {
        return userDatabase.userDAO().getAllUsers();
    }

    public void getUsers() {
        users = new ArrayList<>();
        users = userDatabase.userDAO().getAllUsers();
        userList.postValue(users);
    }

    public void addUser(User user) {
        userDatabase.userDAO().addUser(user);
    }
}
