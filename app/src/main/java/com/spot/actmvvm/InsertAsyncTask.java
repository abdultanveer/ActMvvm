package com.spot.actmvvm;

import android.os.AsyncTask;

import com.spot.actmvvm.data.Note;
import com.spot.actmvvm.data.local.NoteDao;

public class InsertAsyncTask extends AsyncTask<Note,Void,Void> {

    NoteDao mNoteDao;
    public InsertAsyncTask(NoteDao noteDao) {
        mNoteDao = noteDao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.insert(notes[0]);
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }
}
