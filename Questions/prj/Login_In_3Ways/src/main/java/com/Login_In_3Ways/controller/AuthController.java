package com.Login_In_3Ways.controller;

import com.Login_In_3Ways.model.User;
import com.Login_In_3Ways.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    // Sign-Up Endpoint - username + password
    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody User user) {
        // Call the service to register the user
        boolean isRegistered = userService.registerUser(user);
        
        if (isRegistered) {
            // Return success message with HTTP 201 status code
            return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully.");
        } else {
            // Return an error message if the user already exists
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User already exists.");
        }
    }
}
