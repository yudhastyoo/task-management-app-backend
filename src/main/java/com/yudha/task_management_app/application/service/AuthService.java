package com.yudha.task_management_app.application.service;

import com.yudha.task_management_app.application.dto.LoginRequest;
import com.yudha.task_management_app.application.dto.LoginResponse;
import com.yudha.task_management_app.config.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final JwtUtil jwtUtil;

    public AuthService(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    public LoginResponse login(LoginRequest request) {

        String hardcodedUsername = "admin";
        String hardcodedPassword = "admin123";

        if (!hardcodedUsername.equals(request.getUsername()) ||
            !hardcodedPassword.equals(request.getPassword())) {
            throw new RuntimeException("Invalid username or password");
        }

        String token = jwtUtil.generateToken(request.getUsername());
        return new LoginResponse(token);
    }
}
