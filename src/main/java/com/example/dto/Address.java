package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Address {
    private String country;
    private String city;
    private String street;
    private Long homeNumber;
    private Long flatNumber;
}
