package com.example.event.service;

import com.example.event.dto.ClientDTO;
import com.example.event.mapper.ClientMapper;
import com.example.event.model.Client;
import com.example.event.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Service class for Client business logic
@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientMapper clientMapper;

    // Create a new Client
    public ClientDTO createClient(ClientDTO clientDTO) {
        Client client = clientMapper.toEntity(clientDTO);
        Client savedClient = clientRepository.save(client);
        return clientMapper.toDTO(savedClient);
    }

    // Get all Clients
    public List<ClientDTO> getAllClients() {
        List<Client> clients = clientRepository.findAll();
        return clients.stream()
                .map(clientMapper::toDTO)
                .collect(Collectors.toList());
    }

    // Get a Client by ID
    public ClientDTO getClientById(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        return client.map(clientMapper::toDTO).orElse(null);
    }

    // Update a Client
    public ClientDTO updateClient(Long id, ClientDTO clientDTO) {
        Optional<Client> existingClient = clientRepository.findById(id);
        if (existingClient.isPresent()) {
            Client client = clientMapper.toEntity(clientDTO);
            client.setId(id); // Ensure the ID remains the same
            Client updatedClient = clientRepository.save(client);
            return clientMapper.toDTO(updatedClient);
        }
        return null;
    }

    // Delete a Client
    public boolean deleteClient(Long id) {
        if (clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return true;
        }
        return false;
    }
}