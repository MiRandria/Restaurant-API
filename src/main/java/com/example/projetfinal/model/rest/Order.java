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
public class Order {
    private Long id_order;
    private String lastName;
    private String firstName;
    private String phone;
    private String address;
    private String deliveredDate;
    private String meal;
}
