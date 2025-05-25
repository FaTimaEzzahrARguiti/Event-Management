package com.example.event.controller;

import com.example.event.dto.EventDto;
import com.example.event.mapper.EventMapper;
import com.example.event.model.Event;
import com.example.event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @Autowired
    private EventMapper eventMapper;

    @PostMapping
    public ResponseEntity<EventDto> createEvent(@RequestBody EventDto eventDto) {
        Event event = eventMapper.toEntity(eventDto);
        Event savedEvent = eventService.createEvent(event);
        return ResponseEntity.ok(eventMapper.toDto(savedEvent));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EventDto> updateEvent(@PathVariable Long id, @RequestBody EventDto eventDto) {
        Event event = eventMapper.toEntity(eventDto);
        Event updatedEvent = eventService.updateEvent(id, event);
        return ResponseEntity.ok(eventMapper.toDto(updatedEvent));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
        eventService.deleteEvent(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventDto> getEventById(@PathVariable Long id) {
        Event event = eventService.getEventById(id);
        return ResponseEntity.ok(eventMapper.toDto(event));
    }

    @GetMapping
    public ResponseEntity<List<EventDto>> getAllEvents() {
        List<Event> events = eventService.getAllEvents();
        List<EventDto> eventDtos = events.stream()
                .map(eventMapper::toDto)
                .collect(Collectors.toList());
        return ResponseEntity.ok(eventDtos);
    }

    @GetMapping("/search")
    public ResponseEntity<List<EventDto>> searchEvents(
            @RequestParam(required = false) String categorie,
            @RequestParam(required = false) String lieu,
            @RequestParam(required = false) String date) {
        List<Event> events = eventService.searchEvents(categorie, lieu, date);
        List<EventDto> eventDtos = events.stream()
                .map(eventMapper::toDto)
                .collect(Collectors.toList());
        return ResponseEntity.ok(eventDtos);
    }
}