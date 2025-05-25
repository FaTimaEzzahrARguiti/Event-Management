package com.example.event.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
    public class Reservation {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private LocalDateTime dateReservation;
        private int nombrePlaces;
        private double montantTotal;

        @ManyToOne
        @JoinColumn(name = "client_id", nullable = false) // 🔧 clé étrangère vers Client

        private Client client; // Ou `Client` si tu as une classe qui hérite de User

        @ManyToOne
        @JoinColumn(name = "event_id", nullable = false) // 🔧 clé étrangère vers Event
        private Event event;

}
