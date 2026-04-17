package com.Login_In_3Ways.controller;

import com.Login_In_3Ways.model.User;
import com.Login_In_3Ways.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
   
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
   System.out.println("hello");
    }

    // User Registration - First-time sign-up (create username + password)
    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody User user) {
        // Handle user registration
        boolean isRegistered = userService.registerUser(user);
        
        if (isRegistered) {
            return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully.");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User already exists.");
        }
    }
}