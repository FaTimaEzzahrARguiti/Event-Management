package com.example.event.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ReservationDto implements Serializable {
    private Long id;
    private LocalDateTime dateReservation;
    private int nombrePlaces;
    private double montantTotal;

    private Long clientId;
    private String clientNom; // ou clientEmail si tu préfères

    private Long eventId;
    private String eventTitre;

    public ReservationDto(Long id, LocalDateTime dateReservation, int nombrePlaces, double montantTotal, Long clientId, String clientNom, Long eventId, String eventTitre) {
        this.id = id;
        this.dateReservation = dateReservation;
        this.nombrePlaces = nombrePlaces;
        this.montantTotal = montantTotal;
        this.clientId = clientId;
        this.clientNom = clientNom;
        this.eventId = eventId;
        this.eventTitre = eventTitre;
    }

    public ReservationDto() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(LocalDateTime dateReservation) {
        this.dateReservation = dateReservation;
    }

    public int getNombrePlaces() {
        return nombrePlaces;
    }

    public void setNombrePlaces(int nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getClientNom() {
        return clientNom;
    }

    public void setClientNom(String clientNom) {
        this.clientNom = clientNom;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getEventTitre() {
        return eventTitre;
    }

    public void setEventTitre(String eventTitre) {
        this.eventTitre = eventTitre;
    }
}
