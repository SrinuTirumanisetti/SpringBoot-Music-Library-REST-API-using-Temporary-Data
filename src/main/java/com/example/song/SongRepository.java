package com.example.song;

import java.util.ArrayList;

public interface SongRepository {
    ArrayList<Song> getSongs();
    Song addSong(Song song);
    Song getSong(int bookId);
}
