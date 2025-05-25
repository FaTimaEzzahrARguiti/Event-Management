package com.example.event.mapper;

import com.example.event.dto.EventDto;
import com.example.event.model.Event;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EventMapper {

    // Map Event to EventDto
    EventDto toDto(Event event);

    // Map EventDto to Event, ignoring reservations
    @Mapping(target = "reservetions", ignore = true)
    Event toEntity(EventDto eventDto);
}