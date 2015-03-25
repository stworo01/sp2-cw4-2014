package stworo01;

/**
 * A ship of length 2
 * 
 * @author Stefan Tworogal
 *
 */
public class Destroyer extends Ship {

	/**
	 * Construct an instance of a class Destroyer with ship length 2
	 */
	public Destroyer() {
		super();
		length = 2;

	}

	@Override
	public String toString() {
		return "D";
	}

	@Override
	public String getShipType() {
		return "Destroyer";
	}

}
