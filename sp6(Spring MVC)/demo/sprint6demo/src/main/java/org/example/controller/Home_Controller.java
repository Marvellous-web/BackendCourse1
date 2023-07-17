package org.example.controller;

import org.example.dao.SongDAO;
import org.example.model.SongModal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Home_Controller {

    SongDAO songDAO=new SongDAO();
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

        List<SongModal> songModalList=songDAO.getMasterdata();
        m.addAttribute("songsObjects",songModalList);


        return "landpage";
    }

    @PostMapping("/reqSendSong")

    public String saveSong(@RequestParam("id")String b,@RequestParam("song_rating")String rating,@RequestParam("song_name")String name,@RequestParam("singer_name")String singer_name)
    {
        SongModal songModal=new SongModal(Integer.parseInt(b),Float.parseFloat(rating),name,singer_name);
        System.out.println(songModal);
        songDAO.addSong(songModal);
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
