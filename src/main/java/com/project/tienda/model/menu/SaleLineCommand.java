package com.project.tienda.model.menu;

import com.project.tienda.model.order.types.SaleOrder;
import com.project.tienda.utils.LimitedIntDialog;

public class SaleLineCommand extends Command{
    public SaleLineCommand() {
        super("Linea de venta");
    }

    @Override
    public void execute() {
        int id = LimitedIntDialog.instance().read("Código", 1000);
        int units = LimitedIntDialog.instance().read("Unidades", 1000);
        ticket.add(new SaleOrder(id, units));
    }
}
