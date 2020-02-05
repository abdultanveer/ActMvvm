package com.spot.actmvvm.data.local;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.spot.actmvvm.data.Note;

@Database(entities = {Note.class}, version = 1)
public abstract class NoteDatabase extends RoomDatabase {

    public abstract NoteDao noteDao();
    private static NoteDatabase INSTANCE;

    public static NoteDatabase getDatabase(final Context context) {


        INSTANCE = Room.databaseBuilder(context,NoteDatabase.class,"note_database")
                .build();
        return INSTANCE;
    }

}
