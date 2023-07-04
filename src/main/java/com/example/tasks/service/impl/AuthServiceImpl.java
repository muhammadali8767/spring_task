package com.example.tasks.service.impl;

import com.example.tasks.service.AuthService;
import com.example.tasks.web.dto.auth.JwtRequest;
import com.example.tasks.web.dto.auth.JwtResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String token) {
        return null;
    }
}
