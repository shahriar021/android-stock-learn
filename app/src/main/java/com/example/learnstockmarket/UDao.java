package com.example.learnstockmarket;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface UDao {
    @Insert
    void insertrecrd(User user);

}
