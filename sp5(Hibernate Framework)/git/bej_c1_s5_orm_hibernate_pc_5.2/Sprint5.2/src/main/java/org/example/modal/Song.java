package org.example.modal;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //for autogenerate the id
    private int id;
    private String songname,song_dur,artist;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    public String getSong_dur() {
        return song_dur;
    }

    public void setSong_dur(String song_dur) {
        this.song_dur = song_dur;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Song() {
    }

    public Song(int id, String songname, String song_dur, String artist) {
        this.id = id;
        this.songname = songname;
        this.song_dur = song_dur;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", songname='" + songname + '\'' +
                ", song_dur='" + song_dur + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
