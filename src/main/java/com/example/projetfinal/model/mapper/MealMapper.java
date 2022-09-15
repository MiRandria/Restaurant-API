package com.example.projetfinal.model.mapper;

import com.example.projetfinal.model.Category;
import com.example.projetfinal.service.CategoryService;
import com.example.projetfinal.model.rest.CreateMeal;
import com.example.projetfinal.model.rest.Meal;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class MealMapper {
    private CategoryService categoryService;

    public Meal toRest(com.example.projetfinal.model.Meal domain) {
        return Meal.builder()
                .id_meal(domain.getId_meal())
                .name(domain.getName())
                .unit_price(domain.getUnit_price())
                .category(String.valueOf((domain.getCategory())))
                .build();
    }

    public com.example.projetfinal.model.Meal toDomain(CreateMeal toCreate) {
        Optional<Category> category = categoryService.getById(toCreate.getId_category());
        com.example.projetfinal.model.Meal domain = new com.example.projetfinal.model.Meal();
        domain.setName(toCreate.getName());
        domain.setUnit_price(toCreate.getUnit_price());
        domain.setCategory(category.get());
        return domain;
    }
}
