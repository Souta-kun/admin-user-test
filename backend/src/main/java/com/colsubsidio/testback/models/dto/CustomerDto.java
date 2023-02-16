package com.colsubsidio.testback.models.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class CustomerDto {
    private String name;
    private String email;
    private String password;
    private List<PhoneDto> phones;
    private Boolean isActive;
    private LocalDateTime lastLogin;
    private String token;
}