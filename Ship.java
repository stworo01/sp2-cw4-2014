package stworo01;

/**
 * @author Stefan Tworogal
 *
 */
public class Ship {
// instance variables
	protected int bowRow;
	protected int bowColumn;
	protected int length;
	protected boolean horizontal;
	protected boolean[] hit = new boolean[length];
	protected String shipType;

	// Getters and Setters
	
	/**
	 * Get the position of the ships Bow row
	 * @return bowRow
	 */
	public int getBowRow() {
		return bowRow;
	}
	
	/**
	 * Sets the position of the ships Bow row
	 * @param bowRow 	 */
	public void setBowRow(int bowRow) {
		this.bowRow = bowRow;
	}
	/**
	 * Gets the position of the ships bow column
	 * @return the bowColumn
	 */
	public int getBowColumn() {
		return bowColumn;
	}
	/**
	 * Sets the position of the ships bow column
	 * @param bowColumn 
	 */
	public void setBowColumn(int bowColumn) {
		this.bowColumn = bowColumn;
	}
	/**
	 * Returns true if the ship is oriented horizontally
	 * otherwise returns false
	 * @return the isHorizontal
	 */
	public boolean isHorizontal() {
		return horizontal;
	}
	/**
	 * Sets the value of isHorizontal to true
	 * @param isHorizontal 
	 */
	public void setHorizontal(boolean horizontal) {
		this.horizontal = true;
	}
	/**
	 * Get the type of ship 
	 * @return shipType
	 */
	public String getShipType() {
		return shipType;
	}
	/**
	 * Gets the length of the ship
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
	public boolean okToPlaceShipAt(int row, int column,boolean horizontal, Ocean ocean) {
		
		return false;
		
		
		
		
	}
	/**
	 * 
	 * @param row
	 * @param column
	 * @param horizontal
	 * @param ocean
	 */
	public void placeShipAt(int row, int column, boolean horizontal, Ocean ocean) {
		// complete
	}
	/**
	 * 
	 * @param row
	 * @param column
	 * @return
	 */
	public boolean shootAt(int row, int column) {
		// complete
		return false;
	}
	/**
	 * 
	 * @return
	 */
	public boolean isSunk() {
		// complete
		return false;
	}
	
	
	
	
	
	
	
	
	
	
}
