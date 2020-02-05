package com.spot.actmvvm.data.local;

import androidx.room.Insert;

import com.spot.actmvvm.data.Note;

@androidx.room.Dao
public interface NoteDao {

    @Insert
    void insert(Note note);
}
