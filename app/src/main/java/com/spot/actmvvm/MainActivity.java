package com.spot.actmvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.spot.actmvvm.data.Note;
import com.spot.actmvvm.data.local.GetAsyncTask;
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
        //insert();
        getAllNotes();

    }

    private void getAllNotes() {
        GetAsyncTask getAsyncTask = new GetAsyncTask(noteDao);
        getAsyncTask.execute();
    }

    private void insert() {
        EditText titleEditText  = findViewById(R.id.editTextTitle);
        EditText subtitleEditText  = findViewById(R.id.editTextSubtitle);

        String title = titleEditText.getText().toString();
        String subTitle = subtitleEditText.getText().toString();

        Note note = new Note(title,subTitle);

        InsertAsyncTask insertAsyncTask = new InsertAsyncTask(noteDao);
        insertAsyncTask.execute(note);
    }
}
