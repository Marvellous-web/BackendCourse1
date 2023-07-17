package org.example.modal;

import java.util.List;

public class main {
    public static void main(String[] args) {
        SongDAO songDAO=new SongDAO();
        Song song=new Song();
        song.setArtist("Ronaldo2");
        song.setSongname("Waka Waka2");
        song.setSong_dur("05:02");
        // inserting
        System.out.println(songDAO.addSong(song));

        //retrieving songs
        List<Song> songList=songDAO.getAllSongs();
        for (Song song1:songList) {
            System.out.println(song1);
        }

        //delete
        System.out.println(songDAO.deleteSong(2));
        //update
        Song temp=songDAO.getSongById(1);
        temp.setSongname("NitinPreWeddingShoot");
        temp.setSong_dur("KamarTutneTak");
        System.out.println(songDAO.UpdateSong(temp));

    }
}
