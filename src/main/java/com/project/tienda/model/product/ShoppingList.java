package com.project.tienda.model.product;

import java.math.BigInteger;
import java.util.AbstractList;

public class ShoppingList extends AbstractList<ShoppingList>{
    private ShoppingList products;

    @Override
    public boolean add(ShoppingList product) {
        return this.getShoppingList().add(product);
    }

    @Override
    public ShoppingList remove(int index) {
        return this.getShoppingList().remove(index);
    }

    @Override
    public ShoppingList get(int index) {
        return this.getShoppingList().get(index);
    }

    @Override
    public int size() {
        int units = BigInteger.ZERO.intValue();
        for (ShoppingList product : this.getShoppingList()) {
            units += product.getShoppingList().size();
        }
        return units;
    }

    public BigInteger getPrice() {
        BigInteger price = BigInteger.ZERO;
        for (ShoppingList product : this.getShoppingList()) {
            price = price.and(product.getPrice());
        }
        return price;
    }

    public ShoppingList getShoppingList() {
        return products;
    }

    public void set(ShoppingList products) {
        this.products = products;
    }

    public void acceptShoppingListVisitor(ShoppingListVisitor shoppingListVisitor) {
        for (ShoppingList product : this.getShoppingList()) {
            shoppingListVisitor.visitShoppingProduct(product);
        }
    }
}
