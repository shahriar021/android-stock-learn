package com.example.learnstockmarket;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {User.class}, version = 2)
public abstract class Apdatabase extends RoomDatabase {
    public abstract UDao userDao();
}
