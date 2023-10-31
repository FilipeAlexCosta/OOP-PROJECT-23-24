package xxl.app.search;

import xxl.cells.*;
import xxl.cells.search.Search;

/**
 * This class represents a search strategy based on specific values
 *
 */
public class TrueSearch extends Search {
	@Override
	public boolean okBooleanContent(BooleanContent content) {
		return content.getBoolean().equals(true);
	}

	/** @See xxl.cells.search.Search#okIntegerContent */
	@Override
	public boolean okIntegerContent(IntegerContent content) {
		return false;
	}

	/** @See xxl.cells.search.Search#okStringContent */
	@Override
	public boolean okStringContent(StringContent content) {
		return false;
	}

	/** @See xxl.cells.search.Search#okReferenceContent */
	@Override
	public boolean okReferenceContent(ReferenceContent content) {
		Boolean bool = content.getBoolean();
		if (bool != null)
			return bool.equals(true);
		return false;
	}

	/** @See xxl.cells.search.Search#okIntegerBinary */
	@Override
	public boolean okIntegerBinary(IntegerBinary content) {
		return false;
	}

	/** @See xxl.cells.search.Search#okBooleanBinary */
	@Override
	public boolean okBooleanBinary(BooleanBinary content) {
		Boolean bool = content.getBoolean();
		if (bool != null)
			return bool.equals(true);
		return false;
	}

	/** @See xxl.cells.search.Search#okIntegerRange */
	@Override
	public boolean okIntegerRange(IntegerRange content) {
		return false;
	}

	/** @See xxl.cells.search.Search#okStringRange */
	@Override
	public boolean okStringRange(StringRange content) {
		return false;
	}
}
