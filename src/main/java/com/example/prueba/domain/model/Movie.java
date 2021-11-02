package com.example.prueba.domain.model;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "movie")

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID movieid;
    public String title;
    public String imageurl;
}
