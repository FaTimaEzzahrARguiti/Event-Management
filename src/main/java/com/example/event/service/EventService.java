package com.example.event.service;

import com.example.event.model.Event;
import com.example.event.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event updateEvent(Long id, Event updatedEvent) {
        Event existingEvent = getEventById(id);
        existingEvent.setTitre(updatedEvent.getTitre());
        existingEvent.setDescription(updatedEvent.getDescription());
        existingEvent.setLieu(updatedEvent.getLieu());
        existingEvent.setCategorie(updatedEvent.getCategorie());
        existingEvent.setDateDebut(updatedEvent.getDateDebut());
        existingEvent.setDateFin(updatedEvent.getDateFin());
        existingEvent.setPrix(updatedEvent.getPrix());
        existingEvent.setNombrePlaces(updatedEvent.getNombrePlaces());
        existingEvent.setImageUrl(updatedEvent.getImageUrl()); // Added
        return eventRepository.save(existingEvent);
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    public Event getEventById(Long id) {
        return eventRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Événement non trouvé avec id : " + id));
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public List<Event> searchEvents(String categorie, String lieu, String date) {
        if (categorie != null && lieu != null) {
            return eventRepository.findByCategorieAndLieu(categorie, lieu);
        } else if (categorie != null) {
            return eventRepository.findByCategorie(categorie);
        } else if (lieu != null) {
            return eventRepository.findByLieu(lieu);
        } else if (date != null) {
            try {
                LocalDateTime targetDate = LocalDateTime.parse(date);
                return eventRepository.findByDateDebutBetween(targetDate.minusDays(1), targetDate.plusDays(1));
            } catch (DateTimeParseException e) {
                throw new RuntimeException("Format de date invalide. Utilisez le format ISO (ex: 2025-06-01T18:00)");
            }
        } else {
            return getAllEvents();
        }
    }
}