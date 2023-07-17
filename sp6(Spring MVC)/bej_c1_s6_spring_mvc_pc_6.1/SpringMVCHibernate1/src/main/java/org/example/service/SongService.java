package org.example.service;

import org.example.domain.Song;

import java.util.List;


public interface SongService {
    public abstract boolean addSong(Song song);
    public abstract List<Song> getSongs();
}
