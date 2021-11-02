package com.example.prueba.controller;

import com.example.prueba.domain.model.Movie;
import com.example.prueba.repository.MovieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepository movieRepository;
    MovieController(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @GetMapping("/")
    public List<Movie> helloWorld() {
        return movieRepository.findAll();
    }

    @PostMapping("/")
    public Movie createMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }
}
