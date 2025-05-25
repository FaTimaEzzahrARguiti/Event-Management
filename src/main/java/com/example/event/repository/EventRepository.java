package com.example.event.repository;

import com.example.event.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface EventRepository extends JpaRepository<Event,Long> {
    List<Event> findByCategorieAndLieu(String categorie, String lieu);

    List<Event> findByCategorie(String categorie);

    List<Event> findByLieu(String lieu);

    List<Event> findByDateDebutBetween(LocalDateTime minusDays, LocalDateTime plusDays);
}
