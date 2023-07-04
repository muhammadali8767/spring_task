package com.example.tasks.service;

import com.example.tasks.web.dto.auth.JwtRequest;
import com.example.tasks.web.dto.auth.JwtResponse;

public interface AuthService {
    JwtResponse login (JwtRequest loginRequest);
    JwtResponse refresh (String token);
}
