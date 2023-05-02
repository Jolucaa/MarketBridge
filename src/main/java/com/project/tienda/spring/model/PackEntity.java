package com.project.tienda.spring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;



@Data
public class PackEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    @NonNull
    @NotNull
    @OneToMany(cascade = CascadeType.ALL)
    private List<ProductEntity> products;

    public PackEntity() {

    }
}