package com.example.event.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// DTO class to transfer Client data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {
    private Long id;           // Client ID
    private String nom;        // Client name (from User)
    private String email;      // Client email (from User)
    private String motDePasse; // Client password (from User)
    private String role;       // Client role (from User)
    private String telephone;  // Client telephone
    private String adresse;    // Client address
}