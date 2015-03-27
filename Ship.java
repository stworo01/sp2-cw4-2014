package stworo01;

/**
 * @author Stefan Tworogal
 * @version 20/03/15
 */
public class Ship {
	// instance variables
	private int bowRow;
	private int bowColumn;
	protected int length;
	private boolean horizontal;
	protected boolean[] hit = new boolean[4];

	// Getters and Setters
	/**
	 * Get the position of the ships Bow row
	 * 
	 * @return bowRow
	 */
	public int getBowRow() {
		return bowRow;
	}

	/**
	 * Sets the position of the ships Bow row
	 * 
	 * @param bowRow
	 */
	public void setBowRow(int bowRow) {
		this.bowRow = bowRow;
	}

	/**
	 * Gets the position of the ships bow column
	 * 
	 * @return the bowColumn
	 */
	public int getBowColumn() {
		return bowColumn;
	}

	/**
	 * Sets the position of the ships bow column
	 * 
	 * @param bowColumn
	 */
	public void setBowColumn(int bowColumn) {
		this.bowColumn = bowColumn;
	}

	/**
	 * Returns true if the ship is oriented horizontally otherwise returns false
	 * 
	 * @return horizontal
	 */
	public boolean isHorizontal() {
		return horizontal;
	}

	/**
	 * Sets the boolean value of horizontal to true
	 * 
	 * @param horizontal
	 */
	public void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}

	/**
	 * Gets the String variable shipType
	 * 
	 * @return shipType
	 */
	public String getShipType() {
		return null;
	}

	/**
	 * Gets the value of the variable length of the ship
	 * 
	 * @return length
	 */
	public int getLength() {
		return length;
	}

	// Instance methods
	/**
	 * 
	 * @param row
	 * @param column
	 * @param horizontal
	 * @return
	 */
	public boolean okToPlaceShipAt(int row, int column, boolean horizontal,
			Ocean ocean) {
		// TODO

		return false;
	}

	/**
	 * Method that places ship at position given by parameters row, column and
	 * orientation given by boolean horizontal. Places objects, that point to
	 * bow in the adjacent elements depending on the length() of the ship.
	 * 
	 * @param row
	 * @param column
	 * @param horizontal
	 * @param ocean
	 */
	public void placeShipAt(int row, int column, boolean horizontal, Ocean ocean) {
		int rowBound;
		int columnBound;
		// Set the orientation of the ship
		if (horizontal) {
			columnBound = this.getLength();
			rowBound = 1;
		} else {
			rowBound = this.getLength();
			columnBound = 1;
		}
		// Fill shipArray to ship length with ship objects, but with position
		// pointing to bow
		for (int i = 0; i < rowBound; i++) {
			for (int j = 0; j < columnBound; j++) {
				int tempRow = row + i;
				int tempColumn = column + j;
				ocean.getShipArray()[tempRow][tempColumn] = this;
				this.setBowRow(row);
				this.setBowColumn(column);
				this.setHorizontal(horizontal);
			}
		}
	}

	/**
	 * Method that takes the parameters row and column, checks if there is a
	 * ship at that position and if there is that the ship has not been sunk. It
	 * then updates the hit array and returns true. If there is no ship at that
	 * location it returns false. REFERENCE: "EmptySea.class.isInstance(this)"
	 * the idea for this code came from discussion forum.
	 * http://stackoverflow.com/questions/541749/how-to-determine
	 * -an-objects-class-in-java
	 * 
	 * @param row
	 * @param column
	 * @return true if there is a ship that has not been sunk else false.
	 */
	public boolean shootAt(int row, int column) {
		int tempRow = getBowRow();
		int tempColumn = getBowColumn();
		if (!isSunk() || !EmptySea.class.isInstance(this)) {
			if (isHorizontal()) {
				this.hit[column - tempColumn] = true; // update hit array
				return true;
			} else {
				this.hit[row - tempRow] = true; // update hit array
				return true;
			}
		}
		return false;

	}

	/**
	 * Method that checks the hit array, if the hit array is true for each
	 * element that represents the bow and other parts of the ship it returns
	 * true otherwise returns false.
	 * 
	 * @return true is ship is sunk, otherwise false.
	 */
	public boolean isSunk() {
		int length = this.getLength();
		boolean flag = false;
		for (int i = 0; i < length - 1; i++) { // cycle through hit array
			if (this.hit[i]) {
				flag = true;
			} else {
				flag = false;
			}
		}// close for
		return flag;
	}

	/**
	 * @return the hit
	 */
	public boolean[] getHit() {
		return hit;
	}
}
