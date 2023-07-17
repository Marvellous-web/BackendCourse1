package org.example.model;

import org.springframework.ui.Model;

public class SongModal {
private int id; private float song_rating;
private String song_name,singer_name;

    public SongModal() {
    }

    public SongModal(int id, float song_rating, String song_name, String singer_name) {
        this.id = id;
        this.song_rating = song_rating;
        this.song_name = song_name;
        this.singer_name = singer_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSong_rating() {
        return song_rating;
    }

    public void setSong_rating(float song_rating) {
        this.song_rating = song_rating;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public String getSinger_name() {
        return singer_name;
    }

    public void setSinger_name(String singer_name) {
        this.singer_name = singer_name;
    }

    @Override
    public String toString() {
        return "BookModal{" +
                "id=" + id +
                ", song_rating=" + song_rating +
                ", song_name='" + song_name + '\'' +
                ", singer_name='" + singer_name + '\'' +
                '}';
    }
}
