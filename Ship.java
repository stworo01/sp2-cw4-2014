package stworo01;

/**
 * Class Ship.
 *  Remaining issues in this class: okToPlaceShipAt is not working
 * correctly when a ship is being placed directly below another ship that
 * occupies the row 0 of the array. 
 * REFERENCE: "EmptySea.class.isInstance(this)" in method shootAt().
 * The idea for this code came from discussion forum.
 * http://stackoverflow.com/questions/541749/how-to-determine-an-objects
 * -class-in-java
 * 
 * @author Stefan Tworogal
 * 
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
	 * Method that checks the positions around the ship object to ensure that
	 * the position conforms to the rules of the game.
	 * 
	 * @param row
	 * @param column
	 * @param horizontal
	 * @return true
	 */
	public boolean okToPlaceShipAt(int row, int column, boolean horizontal,
			Ocean ocean) {
		boolean flagAbove = false;
		boolean flagBellow = false;
		boolean flagInline = false;

		// if horizontal check above and below
		if (horizontal) {
			flagBellow = checkRange(row + 1, column, horizontal, ocean);
			flagAbove = checkRange(row - 1, column, horizontal, ocean);
			flagInline = checkRange(row, column, horizontal, ocean);
		} else {// check to sides
			flagBellow = checkRange(row, column + 1, horizontal, ocean);
			flagAbove = checkRange(row, column - 1, horizontal, ocean);
			flagInline = checkRange(row, column, horizontal, ocean);
		}
		if (flagAbove && flagBellow && flagInline) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * method checks to see if a position is occupied along a range of the
	 * array.
	 * 
	 * @param row
	 * @param column
	 * @param horizontal
	 * @param ocean
	 * @return true
	 */
	public boolean checkRange(int row, int column, boolean horizontal,
			Ocean ocean) {
		int endRange = this.length + 1;
		// check that ship is in the limits of the game board.
		if (column <= 0) {
			column = column + 1;
		}
		if (column >= 9) {
			column = column - 1;
		}
		if (row <= 0) {
			row = row + 1;
		}
		if (row >= 9) {
			row = row - 1;
		}
		if (horizontal) {
			// check along range
			for (int i = column - 1; i < endRange; i++) {
				if (ocean.isOccupied(row, i)) {
					return false;
				}
			}
		} else {
			for (int j = row - 1; j < endRange; j++) {
				if (ocean.isOccupied(j, column)) {
					return false;
				}
			}
		}
		return true;
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

}
