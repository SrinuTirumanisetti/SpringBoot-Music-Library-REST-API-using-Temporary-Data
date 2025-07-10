/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.song;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.song.SongService;
import com.example.song.Song;

@RestController
public class SongController{
    SongService service = new SongService();

    @GetMapping("/songs")
    public ArrayList<Song> getSongs(){
        return service.getSongs();
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song){
        return service.addSong(song);
    } 

    @GetMapping("/songs/{songId}")
    public Song getSong(@PathVariable("songId") int songId){
        return service.getSong(songId);
    }
}