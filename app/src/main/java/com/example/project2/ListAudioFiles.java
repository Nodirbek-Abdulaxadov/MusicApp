package com.example.project2;

import java.util.ArrayList;

public class ListAudioFiles {
    ArrayList<AudioFile> list;
    String[] titles = {
            "8D Quran Surah Al Fatihah",
            "8D Quran Surah Al Munafiqun",
            "Amazing 8D Quran"
    } ;

    String[] subTitles = {
            "Syaikh Saad Al-Ghamdi",
            "Syaikh Saad Al-Ghamdi",
            "Unknown"
    } ;
    Integer[] images = {
            R.drawable.ic_baseline_music_note_24,
            R.drawable.ic_baseline_music_note_24,
            R.drawable.ic_baseline_music_note_24
    };
    Integer[] filePaths = {
            R.raw.al_fatihah,
            R.raw.al_munafiqun,
            R.raw.amazing
    } ;

    public ListAudioFiles() {
        list = new ArrayList<AudioFile>();
        for (int i = 0; i < titles.length; i++) {
            AudioFile file = new AudioFile();
            file.title = titles[i];
            file.subTitle = subTitles[i];
            file.imageSourceId = images[i];
            file.filePathId = filePaths[i];
            list.add(file);
        }
    }

    public ArrayList<AudioFile> getList() {
        return list;
    }
}
