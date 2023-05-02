package com.project.tienda.model.menu;

public class ExitCommand extends Command{
    private boolean closed;

    protected ExitCommand() {
        super("Salir");
        this.reset();
    }

    @Override
    public void execute() {
        ticket.close();
        closed = true;
    }

    public boolean closed() {
        return closed;
    }

    public void reset() {
        closed = false;
    }
}

