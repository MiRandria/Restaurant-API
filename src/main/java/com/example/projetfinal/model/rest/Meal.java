package com.example.projetfinal.model.rest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Meal {
    private Long id_meal;
    private String name;
    private String unit_price;
    private String category;
}
