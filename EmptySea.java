package stworo01;

/**
 * Class EmptySea extends Class Ships, It is used to denote an area without a
 * ship.
 * 
 * @author Stefan Tworogal
 *
 */
public class EmptySea extends Ship {

	/**
	 * Construct a instance of class EmptySea with ship length 1.
	 */
	public EmptySea() {
		super();
		length = 1;
	}

	@Override
	public boolean shootAt(int row, int column) {
		return false;
	}

	@Override
	public boolean isSunk() {
		return false;
	}

	@Override
	public String toString() {
		return ".";
	}

	@Override
	public String getShipType() {
		return "EmptySea";
	}

}
