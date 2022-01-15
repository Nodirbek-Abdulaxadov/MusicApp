package com.example.project2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_items);

        ListAudioFiles af =  new ListAudioFiles();

        AudioFiles adapter = new
                AudioFiles(MainActivity.this, af.getList());
        listView.setAdapter(adapter);

    }
}