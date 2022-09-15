package com.example.projetfinal.controller;

import com.example.projetfinal.model.Meal;
import com.example.projetfinal.model.mapper.MealMapper;
import com.example.projetfinal.model.rest.CreateMeal;
import com.example.projetfinal.service.MealService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/meals")
@CrossOrigin(value = "*")
public class MealController {
    private MealService service;
    private MealMapper mapper;

    @GetMapping
    public List<Meal> getAllMeals(){
        return service.findAllMeal();
    }
    @PostMapping
    public List<Meal> createMeal(@RequestBody List<CreateMeal> toCreate){
        var toSave = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.save(toSave);
    }}
