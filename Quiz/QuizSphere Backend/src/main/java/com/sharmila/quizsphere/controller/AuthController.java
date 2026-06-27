package com.sharmila.quizsphere.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharmila.quizsphere.dto.LoginRequest;
import com.sharmila.quizsphere.dto.RegisterRequest;
import com.sharmila.quizsphere.entity.User;
import com.sharmila.quizsphere.service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public User register(
            @RequestBody RegisterRequest request) {

        return authService.register(request);
    }

    @PostMapping("/login")
public User login(@RequestBody LoginRequest request) {

    return authService.login(request);
}
}