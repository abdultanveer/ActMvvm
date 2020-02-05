package com.spot.actmvvm.data.local;

import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.spot.actmvvm.data.Note;

import java.util.List;

public class GetAsyncTask extends AsyncTask<Void, Void, LiveData<List<Note>>> {
    NoteDao mnoteDao;
    public GetAsyncTask(NoteDao noteDao) {
        mnoteDao = noteDao;
    }

    @Override
    protected LiveData<List<Note>> doInBackground(Void... voids) {

        return         mnoteDao.getAllWords();

    }

    @Override
    protected void onPostExecute(LiveData<List<Note>> notes) {
        super.onPostExecute(notes);
    }
}
