package xxl.app.main;

import pt.tecnico.uilib.forms.Form;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import xxl.Calculator;

/**
 * Open menu.
 */
class DoOpenMenuTeste extends Command<Calculator> {

    DoOpenMenuTeste(Calculator receiver) {
        super("Abrir menu de teste", receiver, r -> r.getSpreadsheet() != null);
    }

    @Override
    protected final void execute() throws CommandException {
        (new xxl.app.teste.Menu(_receiver.getSpreadsheet())).open();
    }

}
