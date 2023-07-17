package org.example.controller;

import org.example.domain.Movie;
import org.example.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping("/")
    public String displayMoviePage(Model m)
    {

        List<Movie> movie=movieService.getSongs();
        System.out.println(movie);
        m.addAttribute("movie",movie);
        return "index";
    }
}
