package com.project.tienda.model.ticket;

import com.project.tienda.model.order.types.CancellationOrder;
import com.project.tienda.model.order.types.RepetitionOrder;
import com.project.tienda.model.order.types.ReturnOrder;
import com.project.tienda.model.order.types.SaleOrder;
import com.project.tienda.model.product.ShoppingListVisitor;

public interface TicketVisitor extends ShoppingListVisitor {
    void visit(Header header);
    void visit(Ticket ticket);
    void visit(Footer footer);
    void visit(SaleOrder saleOrder);

    void visit(CancellationOrder cancellationOrder);

    void visit(ReturnOrder returnOrder);

    void visit(RepetitionOrder repetitionOrder);
}
