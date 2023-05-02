package com.project.tienda.model.order.types;

import com.project.tienda.model.ticket.TicketVisitor;

public class ReturnOrder extends IdOrder {

	public ReturnOrder(int id, int units) {
		super(id, units);
	}

	public void accept(TicketVisitor ticketVisitor) {
		ticketVisitor.visit(this);
	}
	
	@Override
	public String toString() {
		return "ReturnLine " + super.toString();
	}
		
}