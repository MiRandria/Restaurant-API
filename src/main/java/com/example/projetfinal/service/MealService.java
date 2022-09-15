package com.example.projetfinal.service;

import com.example.projetfinal.model.Meal;
import com.example.projetfinal.repository.MealRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class MealService {
    private final MealRepository mealRepository;

    public List<Meal> findAllMeal(){
        return mealRepository.findAll();
    }
    public Optional<Meal> getById(Long id){
        return mealRepository.findById(id);
    }

    public List<Meal> save(List<Meal> toSave){
        return mealRepository.saveAll(toSave);
    }


}


