package com.example.tasks.web.dto.user;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String username;
    private String passwordConfirmation;

}
