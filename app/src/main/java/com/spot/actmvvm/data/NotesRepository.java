package com.spot.actmvvm.data;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.spot.actmvvm.data.local.NoteDao;
import com.spot.actmvvm.data.local.NoteDatabase;

import java.util.List;

public class NotesRepository {
    private NoteDao noteDao;
    private LiveData<List<Note>> mAllWords;

    public NotesRepository(Application application) {
        NoteDatabase noteDatabase = NoteDatabase.getDatabase(application);
        noteDao = noteDatabase.noteDao();
        mAllWords = noteDao.getAllWords();
    }

   public LiveData<List<Note>> getAllWords() {
        return mAllWords;
    }
}
