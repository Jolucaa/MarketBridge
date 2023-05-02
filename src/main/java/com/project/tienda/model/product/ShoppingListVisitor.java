package com.project.tienda.model.product;

import com.project.tienda.model.product.carnico.Veal;
import com.project.tienda.model.product.pescado.Salmon;
import com.project.tienda.model.product.vegetable.Lettuce;

public interface ShoppingListVisitor {
    public void visitShoppingProduct(ShoppingList product);

    public void visitShoppingProduct(Veal veal);

    public void visitShoppingProduct(Salmon salmon);

    public void visitShoppingProduct(Lettuce lettuce);
}
