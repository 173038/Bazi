package com.example.bazi.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.bazi.models.Cars;


@Database(entities = {Cars.class}, version = 1)
public abstract class RentDatabase extends RoomDatabase {

    public abstract RentCarsDao getRentCarsDao();



}
