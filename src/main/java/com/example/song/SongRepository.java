package com.example.song;

import java.util.ArrayList;

public interface SongRepository {
    ArrayList<Song> getSongs();
    Song addSong(Song song);
    Song getSong(int bookId);
    Song updateSong(Song song,int songId);
    void deleteSong(int songId);
}
