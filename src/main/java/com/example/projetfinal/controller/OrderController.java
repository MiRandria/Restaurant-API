package com.example.projetfinal.controller;

import com.example.projetfinal.model.Meal;
import com.example.projetfinal.model.Order;
import com.example.projetfinal.model.mapper.OrderMapper;
import com.example.projetfinal.model.rest.CreateMeal;
import com.example.projetfinal.model.rest.CreateOrder;
import com.example.projetfinal.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/orders")
@CrossOrigin
public class OrderController {
    private OrderService orderService;
    private OrderMapper mapper;

    @GetMapping
    public List<Order> getAllOrders(){
        return orderService.findAllOrders();
    }
    @PostMapping
    public List<Order> createOrder(@RequestBody List<CreateOrder> toCreate){
        var toSave = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return orderService.save(toSave);
    }
}

