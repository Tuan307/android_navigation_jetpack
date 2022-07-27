package com.example.demoproject.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.demoproject.User;

import java.util.List;

@Dao
public interface UserDAO {

    @Query("SELECT * FROM user_database")
    List<User> getAllUsers();

    @Insert
    void addUser(User user);
}
