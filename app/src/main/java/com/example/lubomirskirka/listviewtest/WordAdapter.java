package com.example.lubomirskirka.listviewtest;

import android.app.Activity;
import android.app.ActivityOptions;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lubomirskirka on 28.12.2016.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    public WordAdapter(Activity contex, ArrayList<Word> arrayList){
        super(contex,0,arrayList);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.word, parent, false);
        }

        Word currentAndroidFlavor = getItem(position);

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.textView2);
        defaultTextView.setText(currentAndroidFlavor.string1);


        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.textView);
        miwokTextView.setText(currentAndroidFlavor.string2);

        return listItemView;
    }
}
