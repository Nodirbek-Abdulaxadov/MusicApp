package com.example.project2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AudioFiles extends ArrayAdapter<String> {

    private final Activity context;
    private final ArrayList<AudioFile> list;
    public AudioFiles(Activity context,
                      ArrayList<AudioFile> list) {
        super(context, R.layout.list_item);
        this.context = context;
        this.list = list;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        @SuppressLint({"ViewHolder", "InflateParams"}) View rowView= inflater.inflate(R.layout.list_item, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        txtTitle.setText(list.get(position).title);

        TextView subtxtTitle = (TextView) rowView.findViewById(R.id.subtxt);
        subtxtTitle.setText(list.get(position).subTitle);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        imageView.setImageResource(list.get(position).imageSourceId);


        return rowView;
    }
}

