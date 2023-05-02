package com.project.tienda.spring.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name ="sell")
@Data
public class SellEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private TicketEntity ticket;
    @OneToMany(cascade = CascadeType.ALL)
    private List<ProductEntity> product;
}
