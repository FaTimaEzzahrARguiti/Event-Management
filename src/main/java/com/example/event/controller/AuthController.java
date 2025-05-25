// package com.example.event.controller;

// import com.example.event.dto.AuthResponse;
// import com.example.event.dto.LoginRequest;
// import com.example.event.dto.RegisterRequest;
// import com.example.event.service.AuthService;
// import jakarta.validation.Valid;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping("/auth")
// public class AuthController {

//     @Autowired
//     private AuthService authService;

//     @PostMapping("/register")
//     public ResponseEntity<?> register(@RequestBody @Valid RegisterRequest request) {
//         return ResponseEntity.ok(authService.register(request));
//     }

//     @PostMapping("/login")
//     public AuthResponse login(@RequestBody @Valid LoginRequest request) {
//         return authService.login(request);
//     }
// }
