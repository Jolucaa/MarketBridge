package com.project.tienda.model.ticket;

import java.time.LocalDate;

public class Header {

    private LocalDate date;

    public Header() {
        this.date = LocalDate.now();
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void accept(TicketVisitor ticketVisitor) {
        ticketVisitor.visit(this);
    }

    @Override
    public String toString() {
        return "Head [date=" + date + "]";
    }

}
