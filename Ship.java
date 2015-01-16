/**
 * 
 */
package stworo01;

/**
 * @author stefan_1
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
	 * @return the bowRow
	 */
	public int getBowRow() {
		return bowRow;
	}
	
	/**
	 * @param bowRow 	 */
	public void setBowRow(int bowRow) {
		this.bowRow = bowRow;
	}
	/**
	 * @return the bowColumn
	 */
	public int getBowColumn() {
		return bowColumn;
	}
	/**
	 * @param bowColumn 
	 */
	public void setBowColumn(int bowColumn) {
		this.bowColumn = bowColumn;
	}
	/**
	 * @return the isHorizontal
	 */
	public boolean horizontal() {
		return horizontal;
	}
	/**
	 * @param horizontal 
	 */
	public void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}
	/**
	 * 
	 */
	public String getShipType() {
		return shipType;
	}
	

	// Instance methods
	/**
	 * 
	 * @param row
	 * @param column
	 * @param horizontal
	 * @return
	 */
	public boolean okToPlaceShipAt(int row, int column,boolean horizontal) {
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
