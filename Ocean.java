package stworo01;

/**
 * @author Stefan Tworogal
 *
 */
public class Ocean {
	// instance variables
	Ship[][] ships = new Ship[10][10];
	private int shotsFired;
	private int hitCount;
	private int shipsSunk;

	/** 
	 * Constructs the emptySea and sets variables to defaults
	 * 
	 */
	public Ocean() {
		createEmptySea();
		shotsFired = 0;
		hitCount = 0;
		shipsSunk = 0;
	}

	/**
	 * This method fills the array ships with EmptySea objects
	 * 
	 * @return array of EmptySea.
	 */
	public Ship[][] createEmptySea() {
		EmptySea e = new EmptySea();
		for (int i = 0; i < ships.length; i++) {
			for (int j = 0; j < ships.length; j++) {
				ships[i][j] = e;
			}
		}
		return ships;
	}

	/**
	 * Method that places 10 ships randomly on the Ocean, Places larger ships
	 * before smaller ones.
	 */
	public void placeAllShipsRandomly() {
		//TODO
	}

	/**
	 * Method that checks if a location contains a ship
	 * 
	 * @return true if location contains a ship otherwise returns false.
	 */
	public boolean isOccupied(int row, int column) {
		//TODO
		return false;
	}

	/**
	 * method that checks if the location contains a real ship that is still
	 * afloat. Updates the number of shotsFired
	 * 
	 * @return true if location has ship which is still afloat.
	 */

	public boolean shootAt(int row, int column) {
		//TODO
		return false;
	}

	/**
	 * method gets the number of shots fired.
	 * @return shotsFired
	 */
	public int getShotsFired() {
		return shotsFired;
	}

	/**
	 * method gets and returns the number of hits
	 * 
	 * @return hitCount
	 */
	public int getHitCount() {
		return hitCount;
	}

	/**
	 * method that gets and returns the number of ships sunk
	 * 
	 * @return shipsSunk
	 */
	public int getShipsSunk() {
		return shipsSunk;
	}

	/**
	 * method that checks if the game is over
	 * 
	 * @return true if all ships are sunk
	 * 
	 */
	public boolean isGameOver() {
		//TODO
		return false;
	}

	/**
	 * method that returns the ships array - required for testing
	 * 
	 * @return array of Ships[][]
	 */
	public Ship[][] getShipArray() {
		return ships;
	}

	/**
	 * method prints out the Ocean
	 */
	public void print() {
		//TODO

	}

}
