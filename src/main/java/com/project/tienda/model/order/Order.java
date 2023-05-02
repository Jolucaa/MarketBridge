package com.project.tienda.model.order;

import com.project.tienda.model.product.ShoppingListVisitor;
import com.project.tienda.model.ticket.Ticket;

public abstract class Order implements OrderLine{
    private Ticket ticket;
    public abstract void accept(ShoppingListVisitor shoppingListVisitor);
    public void invokeOrder(){

    }

    private Ticket getTicket() {
        return ticket;
    }
}
