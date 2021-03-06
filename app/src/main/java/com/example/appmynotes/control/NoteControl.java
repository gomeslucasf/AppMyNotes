package com.example.appmynotes.control;
import android.content.Context;

import com.example.appmynotes.model.ListNotes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class NoteControl {
    //Controladora singleton para a ListNotes

    private static ListNotes listNotes ;
    private static NoteControl singleton;

    private NoteControl(){
        listNotes = new ListNotes();
    }

    public static NoteControl getInstance(){
        if(singleton == null) {
            singleton = new NoteControl();
        }
        return singleton;
    }

    public  ListNotes getListNotes() {
        return listNotes;
    }

    public  void setListNotes(ListNotes listNotes) {
        NoteControl.listNotes = listNotes;
    }

    private boolean isNull(){
        return singleton == null;
    }

    public void Save( FileOutputStream fout ) throws IOException {
        listNotes.Save(fout);
    }
    public void Load(FileInputStream fin) throws IOException, ClassNotFoundException {
        listNotes.Load(fin);
    }

}
