package com.example.event.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;
    private String lieu;

    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;

    private String categorie; // ex : "Sport", "Musique", etc.
    private int nombrePlaces;

    private double prix;

    @Column(name = "image_url")
    private String imageUrl;

    @OneToMany(mappedBy = "event")
    private List<Reservation> reservetions;
}