package com.project.tienda.model.order;

import com.project.tienda.model.product.ShoppingList;
import com.project.tienda.model.product.ShoppingListVisitor;

public interface OrderLine {
    public void accept(ShoppingListVisitor shoppingListVisitor);
    public void invokeOrder();
    public void applyOrderOperation(ShoppingList shoppingList);
}
