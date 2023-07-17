package org.example.controller;

import org.example.domain.Song;
import org.example.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    private SongService songService;

    @RequestMapping("/")
    public String displaySongPage(Model m)
    {

        List<Song> songs=songService.getSongs();
        System.out.println(songs);
        m.addAttribute("song",songs);
        return "index";
    }
}
