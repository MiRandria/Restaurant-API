package com.example.projetfinal.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;


import javax.persistence.*;
import java.util.Set;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "meal")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_meal")
    private Long id_meal;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "unit_price", nullable = false)
    private String unit_price;

    //meal's category
    @ManyToOne
    @JoinColumn
    private Category category;

    //Order
    @JsonIgnore
    @OneToMany
    @JoinColumn(name ="id_order")
    private Set<Order> orders;


}
