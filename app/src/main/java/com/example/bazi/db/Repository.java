package com.example.bazi.db;

import android.content.Context;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.room.Room;

import com.example.bazi.models.Cars;

import java.util.List;

public class Repository {

    private static RentDatabase database = null;

    public Repository(Context context) {
        if(database == null) {
            database = Room
                    .databaseBuilder(context, RentDatabase.class, "db-app")
                    .build();
        }

    }

    public LiveData<List<Cars>> getAllCars() {
        return database.getRentCarsDao().getAllAsync();
    }

    public void insert(final Cars car) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                database.getRentCarsDao().insert(car);
                return null;
            }
        }.execute();
    }

    public void deleteAll() {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                database.getRentCarsDao().deleteAll();
                return null;
            }
        }.execute();

    }

}
