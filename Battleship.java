package stworo01;

/**
 * Class Battleship extends Class Ship.
 * 
 * 
 * @author Stefan Tworogal
 *
 */

public class Battleship extends Ship {

	/**
	 * Construct a ship of Length 4
	 */
	public Battleship() {
		super();
		length = 4;

	}

	@Override
	public String toString() {
		return "B";
	}

	@Override
	public String getShipType() {
		return "Battleship";
	}
}
