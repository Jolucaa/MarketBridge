package com.project.tienda.model.order.types;

import com.project.tienda.model.product.ShoppingList;
import com.project.tienda.model.product.ShoppingListVisitor;
import com.project.tienda.model.ticket.TicketVisitor;

public class CancellationOrder extends NumberOrder {
    public CancellationOrder(int number) {
        super(number);
    }

    public void accept(TicketVisitor ticketVisitor) {
        ticketVisitor.visit(this);
    }

    @Override
    public String toString() {
        return "DeleteOrder " + super.toString();
    }

    @Override
    public void applyOrderOperation(ShoppingList shoppingList) {

    }

    @Override
    public void accept(ShoppingListVisitor shoppingListVisitor) {

    }
}
