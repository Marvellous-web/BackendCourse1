package org.example.repository;

import org.example.domain.Song;

import java.util.List;

public interface SongRespository{
    public abstract boolean addSong(Song song);
    public abstract List<Song> getAllSongs();
}

