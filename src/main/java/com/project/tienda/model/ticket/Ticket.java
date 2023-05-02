package com.project.tienda.model.ticket;

import com.project.tienda.model.Buy;
import com.project.tienda.model.order.Order;
import com.project.tienda.model.order.OrderLine;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void createBuy(Buy buy){
        buy.payment();
    }

    private Header header;

    private List<Order> orderList;

    private Footer footer;

    private TicketVisitor orderTicketOperation;

    private TicketVisitor globalTickeOperation;

    public Ticket(Header header, Footer footer) {
        this.header = header;
        this.orderList = new ArrayList<Order>();
        this.footer = footer;
    }

    public void setOrderTicketOperation(TicketVisitor orderTicketOperation) {
        this.orderTicketOperation = orderTicketOperation;
    }

    public void setGlobalTicketOperation(TicketVisitor globalTickeOperation) {
        this.globalTickeOperation = globalTickeOperation;
    }

    public void open() {
        header.accept(orderTicketOperation);
    }

    public void add(Order order) {
        this.getOrderList().add(order);
        order.accept(orderTicketOperation);
    }

    private List<Order> getOrderList() {
        return orderList;
    }

    public int size() {
        return this.getOrderList().size();
    }
    public void close() {
        footer.accept(orderTicketOperation);
        header.accept(globalTickeOperation);
        for (OrderLine order : this.getOrderList()) {
            order.accept(globalTickeOperation);
        }
        footer.accept(globalTickeOperation);
    }

    public int orders() {
        return this.getOrderList().size();
    }

    public OrderLine getLine(int number) {
        return this.getOrderList().get(number);
    }

    @Override
    public String toString() {
        return "Ticket [\n head=" + header + "\n, lines=" + this.getOrderList().size()
                + "\n, footer=" + footer + "]";
    }
}