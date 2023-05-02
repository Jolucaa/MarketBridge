package com.project.tienda.model.product;

import jakarta.validation.constraints.NotNull;

import java.math.BigInteger;

public interface Discountable{
    public BigInteger getPrice();
    public int size();
    public void applyDiscount(@NotNull Discountable product);
    public boolean isDiscountable();
}
