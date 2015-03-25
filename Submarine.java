/**
 * 
 */
package stworo01;

/**
 * A ship of length 1
 * 
 * @author Stefan Tworogal
 *
 */
public class Submarine extends Ship {

	/**
	 * Construct an instance of class Submarine with ship length 1.
	 */
	public Submarine() {
		super();
		length = 1;

	}

	@Override
	public String toString() {
		return "S";
	}

	@Override
	public String getShipType() {
		return "Submarine";
	}

}
