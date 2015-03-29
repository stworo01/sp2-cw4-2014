package stworo01;

import java.util.Random;

/**
 * Class Ocean.
 * Remaining issues: 1. placeAllShipsRandomly() -- this method is 
 * throwing an intermittent out of bounds error duing testing. I have been unable
 * to trace this error, it may be caused by an error in the Ship method
 * okToPlaceShipAt. 
 * 2. Not implemented: shootAt(int row, int column), print()
 * 
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
	 * Array of types of ship to be placed in empty ocean.
	 * 
	 * @return array of ships
	 */

	public Ship[] fleetOfShips() {
		Ship[] typeOfShip = new Ship[10];
		typeOfShip[0] = new Battleship();
		typeOfShip[1] = new Cruiser();
		typeOfShip[2] = new Cruiser();
		typeOfShip[3] = new Destroyer();
		typeOfShip[4] = new Destroyer();
		typeOfShip[5] = new Destroyer();
		typeOfShip[6] = new Submarine();
		typeOfShip[7] = new Submarine();
		typeOfShip[8] = new Submarine();
		typeOfShip[9] = new Submarine();
		return typeOfShip;
	}

	/**
	 * Method that places 10 ships randomly on the Ocean, Places larger ships
	 * before smaller ones.
	 */
	public void placeAllShipsRandomly() {
		Random r = new Random();
		Ship[] launchShip = fleetOfShips();
		boolean launched;
		for (Ship s : launchShip) { // foreach type of ship
			launched = false;
			while (!launched) {
				// random position and orientation.
				int row = r.nextInt(9);
				int column = r.nextInt(9);
				boolean isHorizontal = r.nextBoolean();
				if (s.okToPlaceShipAt(row, column, isHorizontal, this)) {
					s.placeShipAt(row, column, isHorizontal, this);
					launched = true;
				}
			}
		}
	}

	/**
	 * Method that checks if a location contains a legitimate ship.
	 * 
	 * @return true if location contains a ship otherwise returns false.
	 */
	public boolean isOccupied(int row, int column) {
		Ship s = this.ships[row][column];
		if (s instanceof EmptySea) { // is it EmptyClass
			return false;
		} else {
			return true;
		}
	}

	/**
	 * method that checks if the location contains a real ship that is still
	 * afloat. Updates the number of shotsFired
	 * 
	 * @return true if location has ship which is still afloat.
	 */

	public boolean shootAt(int row, int column) {
		// TODO
		return false;
	}

	/**
	 * method gets the number of shots fired.
	 * 
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
		if (shipsSunk == 10) {
			return true;
		}
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
		// TODO

	}

}
