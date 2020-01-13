package com.example.bazi.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "cars")
public class Cars {

    @ColumnInfo(name = "type")
    public String type;

    @ColumnInfo(name = "price")
    public Integer price;

    @PrimaryKey
    public String chasisno;

    public Cars(String type,Integer price,String no) {
        this.type=type;
        this.price=price;
        this.chasisno=no;
    }
}

