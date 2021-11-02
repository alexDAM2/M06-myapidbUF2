package com.example.prueba.controller;

import com.example.prueba.domain.model.Actor;
import com.example.prueba.repository.ActorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actors")
public class ActorController {

    private final ActorRepository actorRepository;
    ActorController(ActorRepository actorRepository){
        this.actorRepository = actorRepository;
    }

    @GetMapping("/")
    public List<Actor> helloWorld() {
        return actorRepository.findAll();
    }

}