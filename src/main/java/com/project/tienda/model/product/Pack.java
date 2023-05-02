package com.project.tienda.model.product;
import jakarta.validation.constraints.NotNull;

public class Pack extends ShoppingList {
    private ShoppingList shoppingList;
    private Discount discount;

    public boolean isDiscountable(){
        if(!this.getShoppingList().isEmpty()){
            return this.getDiscount().isItDiscountable(this.size());
        }
        return false;
    }

    private Discount getDiscount() {
        return discount;
    }


    public void applyDiscount(@NotNull Discountable product) {
       this.getDiscount().applyDiscount(product);
    }

    public void acceptShoppingListVisitor(ShoppingListVisitor shoppingListVisitor) {
        for (ShoppingList product : this.getShoppingList()) {
            shoppingListVisitor.visitShoppingProduct(product);
        }
    }

}
