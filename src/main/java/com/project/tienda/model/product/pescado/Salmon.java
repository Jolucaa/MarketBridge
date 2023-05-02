package com.project.tienda.model.product.pescado;

import com.project.tienda.model.product.Discountable;
import com.project.tienda.model.product.Product;
import com.project.tienda.model.product.ShoppingList;
import com.project.tienda.model.product.ShoppingListVisitor;
import com.project.tienda.model.product.carnico.Veal;
import com.project.tienda.model.product.vegetable.Lettuce;

public class Salmon extends Product {
    public void acceptShoppingListVisitor(ShoppingListVisitor shoppingListVisitor) {
        shoppingListVisitor.visitShoppingProduct(this);
    }

    @Override
    public void applyDiscount(Discountable product) {

    }

    @Override
    public boolean isDiscountable() {
        return false;
    }

}
