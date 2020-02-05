package com.spot.actmvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.spot.actmvvm.data.local.NoteDao;
import com.spot.actmvvm.data.local.NoteDatabase;

public class MainActivity extends AppCompatActivity {
    NoteDatabase noteDatabase;
    NoteDao noteDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        noteDatabase = NoteDatabase.getDatabase(this);
        noteDao = noteDatabase.noteDao();
    }

    public void clickHandler(View view) {
    }
}
