// package com.example.event.Config;

// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.stereotype.Component;

// import io.jsonwebtoken.Jwts;
// import io.jsonwebtoken.SignatureAlgorithm;
// import io.jsonwebtoken.security.Keys;

// import java.util.Date;

// @Component
// public class JwtUtil {

//     @Value("${jwt.secret}")
//     private String secret;

//     public String generateToken(String email, String role) {
//         return Jwts.builder()
//                 .setSubject(email)
//                 .claim("role", role)
//                 .setIssuedAt(new Date())
//                 .setExpiration(generateExpirationDate())
//                 .signWith(SignatureAlgorithm.HS256, secret.getBytes())
//                 .compact();
//     }

//     private Date generateExpirationDate() {
//         return new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24); // 24h
//     }
// }
