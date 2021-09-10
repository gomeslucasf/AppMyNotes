package com.example.appmynotes.model;

public class Note {
    private String title;
    private String text;
    private int priority;

    public Note(String title, String text, int priority) {
        this.title = title;
        this.text = text;
        this.priority = priority;
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

    public void setPriority(int priority) {
        this.priority = priority;
    }

}
