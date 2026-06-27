package com.sharmila.quizsphere.service;

import com.sharmila.quizsphere.dto.RegisterRequest;
import com.sharmila.quizsphere.entity.User;
import com.sharmila.quizsphere.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AuthServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private AuthService authService;

    public AuthServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testRegisterUser() {

        RegisterRequest request = new RegisterRequest();
        request.setName("Sharmila");
        request.setEmail("test@gmail.com");
        request.setPassword("1234");

        User savedUser = User.builder()
                .id(1L)
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .role("STUDENT")
                .build();

        when(userRepository.save(any(User.class)))
                .thenReturn(savedUser);

        User result = authService.register(request);

        assertNotNull(result);
        assertEquals("Sharmila", result.getName());
    }
}