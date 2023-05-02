package com.project.tienda.spring.model;


import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import lombok.Data;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "product")
@Data
public class ProductEntity {
    @Id
    @NotNull
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 25)
    @NotNull
    @Column(name = "name", nullable = false, length = 25)
    private String name;
    @NotBlank
    @Nonnull
    @NotNull
    private BigInteger price;

    @NotNull
    @Future
    @Column(name = "expiration_date", nullable = false)
    private LocalDate expirationDate;


    @NotNull
    @PastOrPresent
    @Column(name = "start_date", nullable = false)
    private Instant startDate;

    @NotNull
    @FutureOrPresent
    @Column(name = "end_date", nullable = false)
    private Instant endDate;

    @NotNull
    @Column(name = "image", nullable = false)
    private String image;
}