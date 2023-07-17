package org.example.dao;

import org.example.model.SongModal;

import java.util.ArrayList;
import java.util.List;

public class SongDAO {
    private List<SongModal> masterdata=new ArrayList<>();

    public void addSong(SongModal songModal) {
        masterdata.add(songModal);
    }

    public List<SongModal> getMasterdata() {
        return masterdata;
    }
}
