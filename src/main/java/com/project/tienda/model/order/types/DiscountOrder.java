package com.project.tienda.model.order.types;


import com.project.tienda.model.order.Order;

import com.project.tienda.model.product.ShoppingList;
import com.project.tienda.model.product.ShoppingListVisitor;
import com.project.tienda.model.product.carnico.Veal;
import com.project.tienda.model.product.pescado.Salmon;
import com.project.tienda.model.product.vegetable.Lettuce;

public class DiscountOrder extends Order implements ShoppingListVisitor {

    @Override
    public void visitShoppingProduct(ShoppingList shoppingList) {
        shoppingList.acceptShoppingListVisitor(this);
    }

    @Override
    public void visitShoppingProduct(Veal veal) {

    }

    @Override
    public void visitShoppingProduct(Salmon salmon) {

    }

    @Override
    public void visitShoppingProduct(Lettuce lettuce) {

    }

    @Override
    public void accept(ShoppingListVisitor shoppingListVisitor) {

    }

    @Override
    public void applyOrderOperation(ShoppingList shoppingList) {

    }
}
