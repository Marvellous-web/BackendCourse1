package org.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Song {

    @Id
    private String songId;
    private String songName,artistName,duration;

    public Song() {
    }

    public Song(String songId, String songName, String artistName, String duration) {
        this.songId = songId;
        this.songName = songName;
        this.artistName = artistName;
        this.duration = duration;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId='" + songId + '\'' +
                ", songName='" + songName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
