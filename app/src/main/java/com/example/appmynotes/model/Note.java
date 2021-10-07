package com.example.appmynotes.model;

import java.io.Serializable;

public class Note implements Serializable{
    public Note(int priority) {
        this.priority = priority;
    }

    private String title;
    private String text;
    private int priority;
    private Cores cor;


    public Note(String title, String text, int priority) {
        this.title = title;
        this.text = text;
        setPriority(priority);
    }

    public Note() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPriority() {
        return priority;
    }

    /* 0-baixa(Amarela) 1-media 2-Alta */
    public void setPriority(int priority) {
        this.priority = priority;
        switch (priority)
        {
            case 0:
                this.cor = Cores.Amarelo;
                break;
            case 1:
                this.cor = Cores.Azul;
                break;
            case 2:
                this.cor = Cores.Vermelho;
                break;

        }
    }

    public Cores getCor() {
        return cor;
    }


}
