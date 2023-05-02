package com.project.tienda.model.order.types;

import com.project.tienda.model.order.Order;

public abstract class NumberOrder extends Order {
    protected int number;

    protected NumberOrder(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[number=" + number + super.toString() + "]\n";
    }
}
