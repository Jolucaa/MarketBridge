package com.project.tienda.model.menu;

import com.project.tienda.model.ticket.Ticket;

public abstract class Command {

	private String title;
	
	protected Ticket ticket;
	
	protected Command(String title) {
		this.title = title;
	}
	
	public void set(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public String getTitle() {
		return title;
	}
	
	public abstract void execute();

}