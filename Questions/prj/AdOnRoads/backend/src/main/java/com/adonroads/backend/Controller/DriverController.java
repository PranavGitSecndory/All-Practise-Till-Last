package com.adonroads.backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import com.adonroads.backend.Repository.UserRepository;
import com.adonroads.backend.service.UserService;
import com.adonroads.backend.Model.User;
@RestController
@RequestMapping("/api/driver")
public class DriverController {

    @Autowired
    private UserRepository userRepository;  // Assuming you have a UserRepository for database access

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;  // For password encryption

    private String secretKey = "secret";  // Secret key for JWT signing (should be moved to configuration)
  @Autowired
    private UserService userService;  // Injecting UserService

    @GetMapping("/profile")
    public String profile() {
        return "User Profile API working";
    }

    @PostMapping("/create")
    public User createUser(@RequestParam String username, @RequestParam String password) {
        return userService.createUser(username, password);  // Create user via service
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String username, @RequestParam String password) {

        // Find user by username
        Optional<User> userOptional = userRepository.findByUsername(username);

        if (!userOptional.isPresent()) {
            return ResponseEntity.status(401).body("User not found");
        }

        User user = userOptional.get();

        // Verify the password
        if (!passwordEncoder.matches(password, user.getPassword())) {
            return ResponseEntity.status(401).body("Invalid credentials");
        }

        // Generate JWT token
        String token = Jwts.builder()
                .setSubject(user.getUsername())
                .claim("role", user.getRole())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))  // 1 hour expiration
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();

        return ResponseEntity.ok("Bearer " + token);  // Return token in the response
    }
}