package com.example.event.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class EventDto implements Serializable {

    private Long id;
    private String titre;
    private String description;
    private String lieu;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private String categorie;
    private int nombrePlaces;
    private double prix;
    private String imageUrl;


    public EventDto(Long id, String titre, String description, String lieu, LocalDateTime dateDebut, LocalDateTime dateFin, String categorie, int nombrePlaces, double prix, String imageUrl) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.lieu = lieu;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.categorie = categorie;
        this.nombrePlaces = nombrePlaces;
        this.prix = prix;
        this.imageUrl = imageUrl;
    }


    public EventDto() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getNombrePlaces() {
        return nombrePlaces;
    }

    public void setNombrePlaces(int nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
