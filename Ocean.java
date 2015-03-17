package stworo01;
/**
 * @author Stefan Tworogal
 *
 */
public class Ocean {
	//instance variables
	Ship [][] ships = new Ship [10][10];
	int shotsFired;
	int hitCount;
	int shipsSunk;
	
	//construct
	public Ocean() {
		// TODO fill array with EmptySea
		shotsFired = 0;
		hitCount = 0;
		shipsSunk = 0;
	}
	/**
	 * Method that places 10 ships randomly on the Ocean,
	 * Places larger ships before smaller ones.
	 */
	public void placeAllShipsRandomly() {
		
	}
	
	/**
	 * Method that checks if a location contains a ship
	 * @return true if location contains a ship otherwise returns false.
	 */
	public boolean isOccupied(int row, int column) {
		return false;
	}
	
	/**
	 * method that checks if the location contains a real ship that is 
	 * still afloat. Updates the number of shotsFired
	 * @return true if location has ship which is still afloat.
	 */

	public boolean shootAt(int row, int column) {
		return false;
	}
	
	/**
	 * method gets the number of shots fired.
	 */
	public int getShotsFired() {
		return shotsFired;
	}
	/**
	 * method gets the number of hits
	 * @return hitCount
	 */
	public int getHitCount() {
		return hitCount;
	}
	/**
	 * method that gets the number of ships sunk
	 * @return shipsSunk
	 */
	public int getShipsSunk() {
		return shipsSunk;
	}
	/**
	 * method that checks if the game is over
	 * @return true if all ships are sunk 
	 * 
	 */
	public boolean isGameOver() {
		return false;
	}
	/**
	 * method return a 10 X 10 array of ships 
	 * Used for Testing only
	 * @return
	 */
	public Ship[][] getShipArray() {
		return null;
	}
	/**
	 * method prints out the Ocean
	 */
	public void print() {
		
	
	}
	
}
