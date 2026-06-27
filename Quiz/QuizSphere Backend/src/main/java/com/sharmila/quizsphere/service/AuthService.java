package com.sharmila.quizsphere.service;

import org.springframework.stereotype.Service;

import com.sharmila.quizsphere.dto.LoginRequest;
import com.sharmila.quizsphere.dto.RegisterRequest;
import com.sharmila.quizsphere.entity.User;
import com.sharmila.quizsphere.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;

    public User register(RegisterRequest request) {

        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .role("STUDENT")
                .build();

        return userRepository.save(user);
    }

    public User login(LoginRequest request) {

    User user = userRepository.findByEmail(request.getEmail())
            .orElseThrow(() ->
                    new RuntimeException("User not found"));

    if (!user.getPassword().equals(request.getPassword())) {
        throw new RuntimeException("Invalid Password");
    }

    return user;
}
}