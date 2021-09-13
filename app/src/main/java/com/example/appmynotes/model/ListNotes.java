package com.example.appmynotes.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListNotes implements Serializable {
    private List<Note> notes = new ArrayList();

    public List<Note> getNotes() {
        return notes;
    }
    public void setNotes(List<Note> nota){this.notes = notes;}

    public boolean isNull(){return (this.notes == null);}


    /*outros metodos de pesquisa e ordenação */

}
