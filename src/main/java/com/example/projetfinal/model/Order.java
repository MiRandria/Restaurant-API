package com.example.projetfinal.model;


import com.sun.istack.NotNull;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;


import javax.persistence.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private Long id_order;

    //client
    @NotNull
    @Column(name = "lastName", nullable = false)
    private String lastName;

    @NotNull
    @Column(name = "firstName", nullable = false)
    private String firstName;

    @NotNull
    @Column(name = "phone", nullable = false)
    private String phone;

    @NotNull
    @Column(name = "address")
    private String address;

    //livraison
    @NotNull
    @Column(name = "deliveredDate")
    private String deliveredDate;

    //meal
    @ManyToOne
    @JoinColumn
    private Meal meal;


}
