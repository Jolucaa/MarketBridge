package com.project.tienda.model.menu;

import com.project.tienda.model.ticket.Ticket;
import com.project.tienda.utils.LimitedIntDialog;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    protected List<Command> commandList;

    private ExitCommand exitCommand;

    public Menu() {
        this.commandList = new ArrayList<Command>();
        this.setCommands();
        exitCommand = new ExitCommand();
        this.commandList.add(exitCommand);
    }

    protected void setCommands(){};

    protected void set(Ticket ticket) {
        for(Command command : commandList){
            command.set(ticket);
        }
    }

    public void execute(Ticket ticket) {
        this.set(ticket);
        exitCommand.reset();
        do {
            int option = this.getOption();
            commandList.get(option).execute();
        } while (!exitCommand.closed());
    }

    private int getOption() {
        return LimitedIntDialog.instance()
                .read("Opción", 1, commandList.size())-1;
    }

    public boolean isClosed() {
        return exitCommand.closed();
    }
}
