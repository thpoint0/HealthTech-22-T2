package com.example.mhapp4.model;

import java.util.ArrayList;

public class Song {
    private String mName;

    public Song(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    private static int lastContactId = 0;

    public static ArrayList<Song> createSongList(int numSongs) {
        ArrayList<Song> songList = new ArrayList<Song>();

        for (int i = 1; i <= numSongs; i++) {
            songList.add(new Song("Coldplay" + ++lastContactId));
        }

        return songList;
    }
}
