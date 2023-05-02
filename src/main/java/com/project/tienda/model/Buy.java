package com.project.tienda.model;


import com.project.tienda.model.ticket.Ticket;

public class Buy {

    private Long id;
    private Ticket ticket;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public boolean payment(){
        Payment payment = new Payment();
            if(payment.isValid()){
                return this.printTicket();
            }
            return false;
    }

    private boolean printTicket(){
        return true;
    }



}