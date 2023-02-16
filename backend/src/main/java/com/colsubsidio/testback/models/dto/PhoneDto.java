package com.colsubsidio.testback.models.dto;

import lombok.*;

@Getter
@Setter

public class PhoneDto {
    private String countryCode;
    private String cityCode;
    private String number;
}