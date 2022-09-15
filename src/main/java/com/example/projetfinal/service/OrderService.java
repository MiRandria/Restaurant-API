package com.example.projetfinal.service;

import com.example.projetfinal.model.Order;
import com.example.projetfinal.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public List<Order> findAllOrders(){
        return orderRepository.findAll();
    }
    public List<Order> save(List<Order> toSave){
        return orderRepository.saveAll(toSave);
    }



}
