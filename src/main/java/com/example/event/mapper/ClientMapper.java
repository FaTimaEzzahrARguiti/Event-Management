package com.example.event.mapper;

import com.example.event.dto.ClientDTO;
import com.example.event.model.Client;
import org.springframework.stereotype.Component;

// Mapper to convert between Client entity and ClientDTO
@Component
public class ClientMapper {

    // Convert Client entity to ClientDTO
    public ClientDTO toDTO(Client client) {
        if (client == null) {
            return null;
        }
        ClientDTO dto = new ClientDTO();
        dto.setId(client.getId());
        dto.setNom(client.getNom());
        dto.setEmail(client.getEmail());
        dto.setMotDePasse(client.getMotDePasse());
        dto.setRole(client.getRole());
        dto.setTelephone(client.getTelephone());
        dto.setAdresse(client.getAdresse());
        return dto;
    }

    // Convert ClientDTO to Client entity
    public Client toEntity(ClientDTO dto) {
        if (dto == null) {
            return null;
        }
        Client client = new Client();
        client.setId(dto.getId());
        client.setNom(dto.getNom());
        client.setEmail(dto.getEmail());
        client.setMotDePasse(dto.getMotDePasse());
        client.setRole(dto.getRole());
        client.setTelephone(dto.getTelephone());
        client.setAdresse(dto.getAdresse());
        return client;
    }
}