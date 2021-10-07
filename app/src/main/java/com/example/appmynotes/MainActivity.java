package com.example.appmynotes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.service.controls.Control;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.appmynotes.control.NoteControl;
import com.example.appmynotes.model.ListNotes;
import com.example.appmynotes.model.Note;
import com.example.appmynotes.model.NoteAdapter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView componentListNotes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        componentListNotes = (ListView) findViewById(R.id.lvNotes);
        try {
            NoteControl.getInstance().Load(null);
            montarLista();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.mi_fechar:
                finish();
                break;
            case R.id.mi_novaAnotacao:
                Intent intent =new Intent(this,CadastrarActivity.class);
                startActivity(intent);
                break;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStop() {
        super.onStop();

        try {
            //carrega
            /**
             * NoteControl.getInstance().Load(openFileInput("notes.dad"))
             */
            //grava
            NoteControl.getInstance().Save(openFileOutput("notes.dad",Context.MODE_PRIVATE));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void montarLista(){
        NoteAdapter adapter = new NoteAdapter(this, R.layout.item_notes,NoteControl.getInstance().getListNotes().getNotes());
        componentListNotes.setAdapter(adapter);

    }
}