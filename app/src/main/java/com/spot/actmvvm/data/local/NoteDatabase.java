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

        if (INSTANCE == null) {
            synchronized (NoteDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context, NoteDatabase.class, "note_database.db")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }

        }
        return INSTANCE;
    }

    }
