package com.example.bazi.db;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.bazi.models.Cars;

import java.util.List;

@Dao
public interface RentCarsDao {

    @Query("SELECT * from cars")
    @Deprecated
    public List<Cars> getAll();

    @Query("SELECT * from cars")
    public LiveData<List<Cars>> getAllAsync();

    @Insert
    public void insert(Cars car);

    @Query("DELETE from cars WHERE chasisno = :chasis")
    public void delete(String chasis);

    @Query("DELETE from cars")
    public void deleteAll();



}
