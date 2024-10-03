package org.example.dto;

import java.time.LocalDateTime;

public class UserDto {

    Long userId;
    String firstName;
    String lastName;
    String mobile;
    String email;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int version;
}

