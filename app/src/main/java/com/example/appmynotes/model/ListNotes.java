package com.example.appmynotes.model;
import java.util.ArrayList;
import java.util.List;

public class ListNotes {
    private List<Note> notes = new ArrayList();

    public ListNotes(Note notes) {
        this.notes.add(notes);
    }

    public List<Note> getNotes() {
        return notes;
    }

}
