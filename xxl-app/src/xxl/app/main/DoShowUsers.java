package xxl.app.main;

import pt.tecnico.uilib.forms.Form;
import pt.tecnico.uilib.menus.CommandException;
import pt.tecnico.uilib.menus.Command;
import xxl.Calculator;

/**
 * Save to file under current name (if unnamed, query for name).
 */
class DoShowUsers extends Command<Calculator> {

	DoShowUsers(Calculator receiver) {
		super(Label.SHOW_USERS, receiver, xxl -> xxl.getSpreadsheet() != null);
	}

	@Override
	protected final void execute() throws CommandException {
		_display.popup(_receiver.getSpreadsheet().displayUsers());
	}
}
