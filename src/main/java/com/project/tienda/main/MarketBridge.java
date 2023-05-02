package com.project.tienda.main;

import com.project.tienda.model.ticket.Footer;
import com.project.tienda.model.ticket.Header;
import com.project.tienda.model.ticket.Ticket;
import com.project.tienda.model.menu.Menu;

public class MarketBridge {

    public void sell(){
        boolean close = true;
        do{
            Ticket ticket = new Ticket(new Header(), new Footer());
            Menu menu = new Menu();
            menu.execute(ticket);
        } while(!close);
    }

    public static void main(String[] args) {
        new MarketBridge().sell();
    }
}
