package xxl.app.main;

import pt.tecnico.uilib.menus.CommandException;

import java.io.Serial;

/** Exception for reporting general problems opening and processing files. */
public class UserAlreadyExistsException extends CommandException {

	@Serial
	private static final long serialVersionUID = 202310292017L;

	public UserAlreadyExistsException(String username) {
		super("O utilizador " + username + " já existe.");
        }

}
