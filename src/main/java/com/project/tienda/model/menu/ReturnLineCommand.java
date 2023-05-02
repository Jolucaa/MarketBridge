package com.project.tienda.model.menu;

import com.project.tienda.model.order.types.ReturnOrder;
import com.project.tienda.utils.LimitedIntDialog;

public class ReturnLineCommand extends Command{
    public ReturnLineCommand() {
        super("Linea de devolución");
    }


    @Override
    public void execute() {
        int id = LimitedIntDialog.instance().read("Código", 1000);
        int units = LimitedIntDialog.instance().read("Unidades", 1000);
        ticket.add(new ReturnOrder(id, units));
    }
}
