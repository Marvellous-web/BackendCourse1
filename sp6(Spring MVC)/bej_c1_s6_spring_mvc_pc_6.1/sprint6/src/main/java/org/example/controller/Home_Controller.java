package org.example.controller;

import org.example.dao.MovieDAO;
import org.example.model.MovieModal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Home_Controller {

    MovieDAO movieDAO=new MovieDAO();
    @RequestMapping("/")
    public String displayHomePage(Model m)
    {
        System.out.println("/request handled");
        //1
//        int a=10;
//        String b="NIIT";
//        m.addAttribute("x",a);
//        m.addAttribute("y",b);
//        SongModal songModal1=new SongModal(101,4,"Closer","Prophec");
//        m.addAttribute("songobject1",songModal1);
//        SongModal songModal2=new SongModal(102,3,"Attention","Martin");
//        m.addAttribute("songobject2",songModal2);
//
//        List<SongModal> songModals=new ArrayList<SongModal>();
//        songModals.add(songModal1);songModals.add(songModal2);
//        m.addAttribute("song_list",songModals);

        List<MovieModal> movieModalList=movieDAO.getMasterdata();
        m.addAttribute("movieObjects",movieModalList);


        return "landpage";
    }

    @PostMapping("/reqSendMovie")

    public String saveSong(@RequestParam("id")String id,@RequestParam("movie_rating")String rating,@RequestParam("movie_name")String name,@RequestParam("movie_year")String movie_year)
    {
        MovieModal movieModal=new MovieModal(Integer.parseInt(id),Float.parseFloat(rating),name,movie_year);
        System.out.println(movieModal);
        movieDAO.addSong(movieModal);
        return "redirect:/";
    }

    // http://localhost:8080/webmvc2/reqP2
    @RequestMapping("/p2")
    public String displayP2(){
        return "p2";
    }

    // http://localhost:8080/webmvc2/reqHome
    @RequestMapping("/reqHome")
    public String displayHomepage1(){
        return "landpage";
    }

}
