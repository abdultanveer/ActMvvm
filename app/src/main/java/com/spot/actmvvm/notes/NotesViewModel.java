package com.spot.actmvvm.notes;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.spot.actmvvm.data.Note;
import com.spot.actmvvm.data.NotesRepository;

import java.util.List;

public class NotesViewModel  extends AndroidViewModel {

    private NotesRepository mRepository;
    private LiveData<List<Note>> mAllWords;


    public NotesViewModel(@NonNull Application application) {
        super(application);
        mRepository = new NotesRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    LiveData<List<Note>> getAllNotes() { return mAllWords; }

}
