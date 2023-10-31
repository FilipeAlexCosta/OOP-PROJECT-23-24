package xxl.app.main;

import pt.tecnico.uilib.forms.Form;
import pt.tecnico.uilib.menus.CommandException;
import pt.tecnico.uilib.menus.Command;
import xxl.Calculator;
import xxl.exceptions.UserException;

/**
 * Save to file under current name (if unnamed, query for name).
 */
class DoAddUser extends Command<Calculator> {

	DoAddUser(Calculator receiver) {
		super(Label.ADD_USER, receiver, xxl -> xxl.getSpreadsheet() != null);
		addStringField("user", Message.requestUsername());
	}

	@Override
	protected final void execute() throws CommandException {
		try {
			_receiver.getSpreadsheet().addUser(stringField("user"));
		} catch (UserException e) {
			throw new UserAlreadyExistsException(stringField("user"));
		}
	}
}
