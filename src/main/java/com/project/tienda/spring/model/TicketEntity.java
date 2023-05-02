package com.project.tienda.spring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "ticket")
@Data
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @FutureOrPresent
    private LocalDate creation;
    @OneToOne(optional=false, mappedBy="ticket")
    private SellEntity compraVenta;

}