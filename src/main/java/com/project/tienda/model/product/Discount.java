package com.project.tienda.model.product;

import jakarta.validation.constraints.NotNull;

import java.math.BigInteger;

public class Discount {
private BigInteger discountToApply;
private Integer unitsOfProducts;

    public boolean isItDiscountable(Integer units) {
        return this.getUnitsOfProducts() >= units;
    }

    public void setDiscountToApply(BigInteger discountToApply) {
        this.discountToApply = discountToApply;
    }

    public Integer getUnitsOfProducts() {
        return unitsOfProducts;
    }

    public void setUnitsOfProducts(Integer unitsOfProducts) {
        this.unitsOfProducts = unitsOfProducts;
    }

    public void applyDiscount(@NotNull Discountable product) {
        product.getPrice().multiply(this.getDiscountToApply());
    }

    private BigInteger getDiscountToApply() {
        return discountToApply;
    }
}
