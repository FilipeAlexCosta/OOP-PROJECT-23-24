package xxl.app.search;

import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import xxl.Spreadsheet;
import xxl.app.renderers.OutputRenderer;
import xxl.cells.search.PositionCellPair;
import java.util.List;
import xxl.exceptions.UnknownInputException;

/**
 * Command for searching content values.
 */
class DoTrueSearch extends Command<Spreadsheet> {

	DoTrueSearch(Spreadsheet receiver) {
		super(Label.SEARCH_TRUE, receiver);
	}

	@Override
	protected final void execute() throws CommandException {
		List<PositionCellPair> ok = _receiver.search(new TrueSearch());
		var renderer = new OutputRenderer();
		for(PositionCellPair pair: ok) {
			_display.addLine(renderer.combine(pair.getPosition(), pair.getCell()));
		}
		_display.display();
	}
}
