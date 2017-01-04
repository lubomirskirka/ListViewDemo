package com.example.lubomirskirka.listviewtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Pre zobrezenie Stringov v ListView je potrebné Stringy uložiť do ArrayListu
    public static ArrayList<Word> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        showLeftItems();


    }

    private void showLeftItems(){
        //Do ArrayAdaptera vložíme už urobený layout pre jednu položku z androidu android.R.layout.simple_list_item_1 a ArryList so Stringami na zobrazenie
        WordAdapter wordArrayAdapter = new WordAdapter(this,arrayList);

        ListView listViewLeft = (ListView) findViewById(R.id.list_view_left);
        //Na ListView nastavíme adaptér
        listViewLeft.setAdapter(wordArrayAdapter);
    }












    //Obnovenie zoznamu po uložení nového slova v AddWord
    @Override
    protected void onStart() {
        super.onStart();

        showLeftItems();

    }




















    //Small bonus :) Just add button in top app bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.plus_button) {
            startActivity(new Intent(this,AddWord.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
