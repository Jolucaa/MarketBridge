package com.project.tienda.model.order.types;

import com.project.tienda.model.product.ShoppingList;
import com.project.tienda.model.product.ShoppingListVisitor;
import com.project.tienda.model.ticket.TicketVisitor;

public class RepetitionOrder extends NumberOrder {
    public RepetitionOrder(int number) {
        super(number);
    }


    public void accept(TicketVisitor ticketVisitor) {
        ticketVisitor.visit(this);
    }

    @Override
    public String toString() {
        return "RepetitionLine " + super.toString();
    }

    @Override
    public void accept(ShoppingListVisitor shoppingListVisitor) {

    }

    @Override
    public void applyOrderOperation(ShoppingList shoppingList) {

    }
}
