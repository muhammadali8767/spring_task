package com.example.tasks.web.dto.auth;

import lombok.Data;

@Data
public class JwtResponse {
    private Long id;
    private String username;
    private String assccessToken;
    private String refreshToken;
}
