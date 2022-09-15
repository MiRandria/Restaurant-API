package com.example.projetfinal.model.mapper;

import com.example.projetfinal.model.Meal;
import com.example.projetfinal.service.MealService;
import com.example.projetfinal.model.rest.CreateOrder;
import com.example.projetfinal.model.rest.Order;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class OrderMapper {
    private MealService mealService;

    public Order toRest(com.example.projetfinal.model.Order domain) {
        return Order.builder()
                .id_order(domain.getId_order())
                .firstName(domain.getFirstName())
                .lastName(domain.getLastName())
                .phone(domain.getPhone())
                .address(domain.getAddress())
                .deliveredDate(domain.getDeliveredDate())
                .meal(String.valueOf((domain.getMeal())))
                .build();
    }

    public com.example.projetfinal.model.Order toDomain(CreateOrder toCreate) {
        Optional<Meal> meal = mealService.getById(toCreate.getId_meal());
        com.example.projetfinal.model.Order domain = new com.example.projetfinal.model.Order();
        domain.setFirstName(toCreate.getFirstName());
        domain.setLastName(toCreate.getLastName());
        domain.setPhone(toCreate.getPhone());
        domain.setAddress(toCreate.getAddress());
        domain.setDeliveredDate(toCreate.getDeliveredDate());
        domain.setMeal(meal.get());
        return domain;
    }
}