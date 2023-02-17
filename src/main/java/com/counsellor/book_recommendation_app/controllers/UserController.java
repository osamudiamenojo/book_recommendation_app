package com.counsellor.book_recommendation_app.controllers;

import com.counsellor.book_recommendation_app.pojos.SignUpDto;
import com.counsellor.book_recommendation_app.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping
    public ResponseEntity<String> registerUser(@RequestBody SignUpDto signUpDto){
        userService.register(signUpDto);
        return ResponseEntity.status(HttpStatus.CREATED).body("You have been registered successfully")
    }
}
