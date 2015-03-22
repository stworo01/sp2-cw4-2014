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
	protected boolean[] hit = new boolean[length];
	protected String shipType;

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
		this.horizontal = true;
	}

	/**
	 * Gets the String variable shipType
	 * 
	 * @return shipType
	 */
	public String getShipType() {
		return shipType;
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
	 * bow in the adjacent elements dependent on the length() of the ship.
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
	 * 
	 * @param row
	 * @param column
	 * @return
	 */
	public boolean shootAt(int row, int column) {
		// TODO
		return false;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isSunk() {
		// TODO
		return false;
	}
}
