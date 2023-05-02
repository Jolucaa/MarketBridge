package com.project.tienda.model.product.carnico;

import com.project.tienda.model.product.*;
import com.project.tienda.model.product.pescado.Salmon;
import com.project.tienda.model.product.vegetable.Lettuce;


public class Veal extends Product {
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
