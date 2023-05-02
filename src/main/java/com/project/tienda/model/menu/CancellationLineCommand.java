package com.project.tienda.model.menu;

import com.project.tienda.model.order.types.CancellationOrder;
import com.project.tienda.utils.LimitedIntDialog;

public class CancellationLineCommand extends Command{

    public CancellationLineCommand() {
        super("Linea de cancelación");
    }

    @Override
    public void execute() {
        int max = ticket.size();
        int order = LimitedIntDialog.instance().read("Línea", max);
        ticket.add(new CancellationOrder(order));
    }
}
