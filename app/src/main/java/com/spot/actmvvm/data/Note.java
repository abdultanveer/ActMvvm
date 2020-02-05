package com.spot.actmvvm.data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Note {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    @NonNull
    int id;

    @ColumnInfo(name = "title")
    String title;

    @ColumnInfo(name = "subtitle")
    String subTitle;

    public Note(String title, String subTitle) {
        this.title = title;
        this.subTitle = subTitle;
    }


}
