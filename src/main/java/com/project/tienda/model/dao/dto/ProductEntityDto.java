package com.project.tienda.model.dao.dto;

import com.project.tienda.model.product.Product;
import jakarta.validation.constraints.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A DTO for the {@link com.project.tienda.spring.model.ProductEntity} entity
 */
public class ProductEntityDto implements Serializable {
    @NotNull
    private final Long id;
    @Size(max = 25)
    @NotNull
    private final String name;
    @NotBlank
    @NotNull
    private final BigInteger price;
    @NotNull
    @Future
    private final LocalDate expirationDate;
    @NotNull
    @PastOrPresent
    private final Instant startDate;
    @NotNull
    @FutureOrPresent
    private final Instant endDate;

    public ProductEntityDto(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.expirationDate = product.getExpirationDate();
        this.startDate = product.getStartDate();
        this.endDate = product.getEndDate();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigInteger getPrice() {
        return price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public Instant getStartDate() {
        return startDate;
    }

    public Instant getEndDate() {
        return endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntityDto entity = (ProductEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.price, entity.price) &&
                Objects.equals(this.expirationDate, entity.expirationDate) &&
                Objects.equals(this.startDate, entity.startDate) &&
                Objects.equals(this.endDate, entity.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, expirationDate, startDate, endDate);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "price = " + price + ", " +
                "expirationDate = " + expirationDate + ", " +
                "startDate = " + startDate + ", " +
                "endDate = " + endDate + ")";
    }
}