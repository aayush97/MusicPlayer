package com.example.aayush.musicplayer;

public class Song {
    private long id;
    private String title;
    private String artist;
    private String genre;

    public Song(long songID,String songTitle, String songArtist, String songGenre){
        id = songID;
        title = songTitle;
        artist = songArtist;
        genre = songGenre;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre(){
        return genre;
    }
}
