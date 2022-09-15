package com.example.projetfinal.model.rest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateOrder {
    private String lastName;
    private String firstName;
    private String phone;
    private String address;
    private String deliveredDate;
    private Long id_meal;
}
