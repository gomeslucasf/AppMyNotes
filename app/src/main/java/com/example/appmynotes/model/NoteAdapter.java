package com.example.appmynotes.model;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.example.appmynotes.R;

import java.util.List;

public class NoteAdapter extends ArrayAdapter<Note> {
    private int resource;
    public NoteAdapter( Context context, int resource,  List<Note> objects) {
        super(context, resource, objects);
        this.resource = resource;
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        if(convertView == null)
        {
            LayoutInflater inflater =
                    (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(resource,parent,false);
        }
        TextView title = convertView.findViewById(R.id.tvTitleNotes);
        title.setText(""+getItem(position).getTitle());
        convertView.setBackgroundColor(Color.parseColor(getItem(position).getCor().getHexadecimal()));
        /*aqui insere as cores e o q quiser  do item do list view*/

        return convertView;
    }
}
