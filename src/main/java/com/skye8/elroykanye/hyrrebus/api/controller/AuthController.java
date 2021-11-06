package com.skye8.elroykanye.hyrrebus.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Elroy Kanye
 * created on: 06-11-21
 */
@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/auth")
public class AuthController {
    @PostMapping(value = "/login")
    public ResponseEntity<?> login() {
        return null;
    }

    @PostMapping(value = "/register")
    public ResponseEntity<?> register() {
        return null;
    }

    @PostMapping(value = "/verify")
    public ResponseEntity<?> verify() {
        return null;
    }

}
