package com.project.tienda.model.order.types;

import com.project.tienda.model.order.Order;
import com.project.tienda.model.product.ShoppingList;
import com.project.tienda.model.product.ShoppingListVisitor;

public class IdOrder extends Order {
    protected int id;

    protected int units;

    protected IdOrder(int id, int units) {
        this.id = id;
        this.units = units;
    }

    public int getId() {
        return id;
    }

    public int getUnits() {
        return units;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", units=" + units + super.toString() + "]\n";
    }

    @Override
    public void accept(ShoppingListVisitor shoppingListVisitor) {

    }

    @Override
    public void applyOrderOperation(ShoppingList shoppingList) {

    }
}
