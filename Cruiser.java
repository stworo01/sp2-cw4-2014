package stworo01;

/**
 * Class Cruiser extends Class ship
 * 
 * @author Stefan Tworogal
 *
 */
public class Cruiser extends Ship {

	/**
	 * Construct a instance of class Cruiser with ship length 3.
	 */
	public Cruiser() {
		super();
		length = 3;

	}

	@Override
	public String toString() {
		return "C";
	}

	@Override
	public String getShipType() {
		return "Cruiser";
	}
}
