package xxl.cells;

import xxl.cells.renderers.Renderer;
import xxl.cells.search.Search;
import xxl.storage.CellStorage;

/**
 * This class represents an Integer literal.
 */
public class BooleanContent extends Content<Boolean> {
	/** @param integer integer literal to store */
	public BooleanContent(boolean bool) {
		super(bool);
	}
	
	/** @return the stored integer */
	@Override
	public Boolean getBoolean() {
		return getContent();
	}

	/** @See xxl.cells.renderers.Renderable#render */
	@Override
	public String render(Renderer renderer) {
		return renderer.renderBooleanContent(this);
	}

	/** @See xxl.cells.search.Searchable#ok */
	@Override
	public boolean ok(Search search) {
		return search.okBooleanContent(this);
	}

	/** @See Content#copyTo */
	@Override
	public Content copyTo(CellStorage dest, Position pos, boolean dependencies) {
		Content copied = new BooleanContent(getContent());
		dest.insert(pos, copied);
		return copied;
	}
}
