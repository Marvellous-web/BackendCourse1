package org.example.service;

import org.example.domain.Song;
import org.example.repository.SongRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SongServiceImpl implements SongService {
    @Autowired
    private SongRespository songRespository;

    public boolean addSong(Song song)
    {
        return songRespository.addSong(song);
    }
    public List<Song> getSongs()
    {
        return songRespository.getAllSongs();
    }
}
