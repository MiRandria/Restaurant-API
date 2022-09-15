package com.example.projetfinal.model.rest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateMeal {
    private String name;
    private String unit_price;
    private Long id_category;
}
