package org.example.dao;

import org.example.model.MovieModal;


import java.util.ArrayList;
import java.util.List;

public class MovieDAO {
    private List<MovieModal> masterdata=new ArrayList<>();

    public void addSong(MovieModal movieModal) {
        masterdata.add(movieModal);
    }

    public List<MovieModal> getMasterdata() {
        return masterdata;
    }
}
