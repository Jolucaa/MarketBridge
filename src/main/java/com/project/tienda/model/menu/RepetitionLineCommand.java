package com.project.tienda.model.menu;

import com.project.tienda.model.order.types.RepetitionOrder;
import com.project.tienda.utils.LimitedIntDialog;

public class RepetitionLineCommand extends Command{
    public RepetitionLineCommand() {
        super("Linea de repetición");
    }

    @Override
    public void execute() {
        int max = ticket.size();
        int line = LimitedIntDialog.instance().read("Línea? ", max);
        ticket.add(new RepetitionOrder(line));
    }
}
