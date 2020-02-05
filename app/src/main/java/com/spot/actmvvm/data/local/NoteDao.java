package com.spot.actmvvm.data.local;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;

import com.spot.actmvvm.data.Note;

import java.util.List;

@androidx.room.Dao
public interface NoteDao {

    @Insert
    void insert(Note note);

    @Query("SELECT * from note_table ORDER BY title ASC")
    LiveData<List<Note>> getAllWords();
    @Query("SELECT * FROM note_table WHERE title LIKE :word ")
    public List<Note> findWord(String word);
}
