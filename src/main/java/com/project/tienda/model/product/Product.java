package com.project.tienda.model.product;

import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;


public abstract class Product extends ShoppingList implements Discountable {

    private Long id;

    private String name;

    private LocalDate expirationDate;

    private BigInteger price;
    private ShoppingList shoppingList;

    private Instant startDate;

    private Instant endDate;

    public Product() {
    }

    public Product(String name, LocalDate expirationDate) {
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Instant getStartDate() {
        return startDate;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public Instant getEndDate() {
        return endDate;
    }

    public void setEndDate(Instant endDate) {
        this.endDate = endDate;
    }

    public BigInteger getPrice() {
        return this.price;
    }

    public Integer getUnits() {
        return 1;
    }
}