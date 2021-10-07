package com.example.appmynotes.model;
import com.example.appmynotes.control.NoteControl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

    public void Save( FileOutputStream fout ) throws IOException {
/*
        ObjectOutputStream out;
        ListNotes listDeNotes = NoteControl.getInstance().getListNotes();

        out = new ObjectOutputStream(fout);
        out.writeObject(listDeNotes);
        out.close();
        */

    }
    public void Load(FileInputStream fin) throws IOException, ClassNotFoundException {
        notes.add(new Note("Pagar Conta de Luz","R$129,90", 1));
        notes.add(new Note("Pagar Conta de Luz","R$129,90", 2));
        notes.add(new Note("Pagar Conta de Luz","R$129,90", 0));
        notes.add(new Note("Pagar Conta de Luz","R$129,90", 1));
        notes.add(new Note("Pagar Conta de Luz","R$129,90", 2));
        notes.add(new Note("Pagar Conta de Luz","R$129,90", 0));

        /*
        ObjectInputStream in;
        in = new ObjectInputStream(fin);
        NoteControl.getInstance().setListNotes((ListNotes) in.readObject());
        in.close();

 */
    }

    /*outros metodos de pesquisa e ordenação */

}
