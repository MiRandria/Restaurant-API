package com.example.projetfinal.repository;

import com.example.projetfinal.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
