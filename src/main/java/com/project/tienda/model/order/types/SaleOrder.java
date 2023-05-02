package com.project.tienda.model.order.types;

import com.project.tienda.model.ticket.TicketVisitor;

public class SaleOrder extends IdOrder {
    public SaleOrder(int id, int units) {
        super(id, units);
    }

    public void accept(TicketVisitor ticketVisitor) {
        ticketVisitor.visit(this);
    }

    @Override
    public String toString() {
        return "SaleLine " + super.toString();
    }

}
