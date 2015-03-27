package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import stworo01.Battleship;
import stworo01.Cruiser;
import stworo01.Destroyer;
import stworo01.EmptySea;
import stworo01.Ocean;
import stworo01.Ship;
import stworo01.Submarine;

public class ShipTest {

	@Test
	public void testGetBowRow() {
		int testBowRow = 5;
		int expectedOutput = 5;
		Ship a = new Ship();
		a.setBowRow(testBowRow);
		int actualOutput = a.getBowRow();
		assertEquals("Wrong Answer", expectedOutput, actualOutput);
	}

	@Test
	public void testSetBowRow() {
		int testBowRow = 10;
		int expectedOutput = 10;
		Ship b = new Ship();
		b.setBowRow(testBowRow);
		int actualOutput = b.getBowRow();
		assertEquals("Wrong Answer", expectedOutput, actualOutput);
	}

	@Test
	public void testGetBowColumn() {
		int testGetBowColumn = 7;
		int expectedOutput = 7;
		Ship c = new Ship();
		c.setBowRow(testGetBowColumn);
		int actualOutput = c.getBowRow();
		assertEquals("Wrong Answer", expectedOutput, actualOutput);
	}

	@Test
	public void testSetBowColumn() {
		int testSetBowColumn = 1;
		int expectedOutput = 1;
		Ship d = new Ship();
		d.setBowRow(testSetBowColumn);
		int actualOutput = d.getBowRow();
		assertEquals("Wrong Answer", expectedOutput, actualOutput);
	}

	@Test
	public void testIsHorizontal() {
		Ship e = new Ship();
		boolean horizontal = false;
		e.setHorizontal(horizontal);
		boolean actualOutput = e.isHorizontal();
		assertFalse("Wrong Answer", actualOutput);
	}
	@Test
	public void testIsHorizontal2() {
		Ship e = new Ship();
		boolean horizontal = true;
		e.setHorizontal(horizontal);
		boolean actualOutput = e.isHorizontal();
		assertTrue("Wrong Answer", actualOutput);
	}

	@Test
	public void testGetShipType() {
		Battleship f = new Battleship();
		String expected = "Battleship";
		String actual = f.getShipType();
		assertEquals("Wrong Answer", expected, actual);
	}

	@Test
	public void testGetShipType2() {
		Cruiser f = new Cruiser();
		String expected = "Cruiser";
		String actual = f.getShipType();
		assertEquals("Wrong Answer", expected, actual);
	}

	@Test
	public void testGetShipType3() {
		Destroyer f = new Destroyer();
		String expected = "Destroyer";
		String actual = f.getShipType();
		assertEquals("Wrong Answer", expected, actual);
	}

	@Test
	public void testGetShipType4() {
		Submarine f = new Submarine();
		String expected = "Submarine";
		String actual = f.getShipType();
		assertEquals("Wrong Answer", expected, actual);
	}

	@Test
	public void testGetLength() {
		Battleship g = new Battleship();
		int expected = 4;
		int actual = g.getLength();
		assertEquals("Wrong Answer", expected, actual);
	}

	@Test
	public void testGetLength2() {
		Cruiser g = new Cruiser();
		int expected = 3;
		int actual = g.getLength();
		assertEquals("Wrong Answer", expected, actual);
	}

	@Test
	public void testGetLength3() {
		Destroyer g = new Destroyer();
		int expected = 2;
		int actual = g.getLength();
		assertEquals("Wrong Answer", expected, actual);
	}

	@Test
	public void testGetLength4() {
		Submarine g = new Submarine();
		int expected = 1;
		int actual = g.getLength();
		assertEquals("Wrong Answer", expected, actual);
	}

	@Test
	public void testOkToPlaceShipAt() {
		Battleship h = new Battleship();
		Ocean ocean = new Ocean();
		int row = 1;
		int column = 1;
		boolean horizontal = true;
		boolean actual = h.okToPlaceShipAt(row, column, horizontal, ocean);
		assertTrue("Wrong Answer", actual);
	}
	
//	@Test
//	public void testOkToPlaceShipAt2() {
//		Battleship h = new Battleship();
//		Ocean ocean = new Ocean();
//		int row = 1;
//		int column = 2;
//		boolean horizontal = false;
//		boolean actual = h.okToPlaceShipAt(row, column, horizontal, ocean);
//		assertTrue("Wrong Answer", actual);
//	}
//	@Test
//	public void testOkToPlaceShipAt3() {
//		Battleship h = new Battleship();
//		Battleship k = new Battleship();
//		Ocean ocean = new Ocean();
//		int row = 1;
//		int column = 2;
//		boolean horizontal = false;
//		k.placeShipAt(1, 2, true, ocean);
//		boolean actual = h.okToPlaceShipAt(row, column, horizontal, ocean);
//		assertFalse("Wrong Answer", actual);
//	}
	@Test
	public void testPlaceShipAt() {
		Ocean ocean = new Ocean();
		Destroyer d = new Destroyer();
		int row = 4;
		int column = 4;
		boolean horizontal = true;
		d.placeShipAt(row, column, horizontal, ocean);
		Ship actualShipArray[][] = ocean.getShipArray();
		String actual = actualShipArray[row][column].getShipType();
		String expected = "Destroyer";
		assertEquals("Wrong Answer", actual, expected);

	}

	@Test
	public void testPlaceShipAt2() {
		Ocean ocean = new Ocean();
		Destroyer d = new Destroyer();
		int row = 4;
		int column = 4;
		boolean horizontal = true;
		d.placeShipAt(row, column, horizontal, ocean);
		Ship actualShipArray[][] = ocean.getShipArray();
		String actual = actualShipArray[row][column + 1].getShipType();
		String expected = "Destroyer";

		assertEquals("Wrong Answer", actual, expected);

	}

	/*
	 * Test that objects are placed along the length of the ship
	 */
	@Test
	public void testPlaceShipAt3() {
		Ocean ocean = new Ocean();
		Battleship b = new Battleship();
		int row = 4;
		int column = 4;
		boolean horizontal = true;
		b.placeShipAt(row, column, horizontal, ocean);
		Ship actualShipArray[][] = ocean.getShipArray();
		String actual = actualShipArray[row][column + 3].getShipType();
		String expected = "Battleship";
		assertEquals("Wrong Answer", actual, expected);

	}

	@Test
	public void testPlaceShipAt5() {
		Ocean ocean = new Ocean();
		Battleship b = new Battleship();
		int row = 4;
		int column = 4;
		boolean horizontal = false;
		b.placeShipAt(row, column, horizontal, ocean);
		Ship actualShipArray[][] = ocean.getShipArray();
		String actual = actualShipArray[row + 3][column].getShipType();
		String expected = "Battleship";
		assertEquals("Wrong Answer", actual, expected);
	}

	/*
	 * Test that elements along the length of ship point to correct bow position
	 */

	@Test
	public void testPlaceShipAt4() {
		Ocean ocean = new Ocean();
		Battleship b = new Battleship();
		int row = 4;
		int column = 4;
		boolean horizontal = true;
		b.placeShipAt(row, column, horizontal, ocean);
		Ship actualShipArray[][] = ocean.getShipArray();
		int actual = actualShipArray[row][column + 1].getBowRow();
		int expected = 4;
		assertEquals("Wrong Answer", actual, expected);
	}

	@Test
	public void testShootAt() {
		Ocean ocean = new Ocean();
		Battleship b = new Battleship();
		b.placeShipAt(4, 4, true, ocean);
		boolean actual = b.shootAt(4, 4);
		assertTrue("Wrong Answer", actual);
	}

	@Test
	public void testShootAt2() {
		Ocean ocean = new Ocean();
		Battleship c = new Battleship();
		c.placeShipAt(4, 4, true, ocean);
		boolean actual = c.shootAt(4, 5);
		assertTrue("Wrong Answer", actual);
	}

	// Test if ship is virtically positioned
	@Test
	public void testShootAt3() {
		Ocean ocean = new Ocean();
		Battleship c = new Battleship();
		c.placeShipAt(4, 4, false, ocean);		
		boolean actual = c.shootAt(5, 4);
		assertTrue("Wrong Answer", actual);
	}
	@Test
	public void testShootAt4() {
		Ocean ocean = new Ocean();
		EmptySea c = new EmptySea();
		c.placeShipAt(4, 4, false, ocean);		
		boolean actual = c.shootAt(4, 4);
		assertFalse("Wrong Answer", actual);
	}
	

	@Test
	public void testIsSunk() {
		Ocean ocean = new Ocean();
		Cruiser c = new Cruiser();
		int row = 4;
		int column = 4;
		boolean horizontal = true;
		c.placeShipAt(row, column, horizontal, ocean);
		c.shootAt(row, column);
		c.shootAt(row, column + 1);
		c.shootAt(row, column + 2);
		boolean actual = c.isSunk();
		assertTrue("Wrong answer", actual);
	}
	
	@Test
	public void testIsSunk2() {
		Ocean ocean = new Ocean();
		Cruiser c = new Cruiser();
		int row = 4;
		int column = 4;
		boolean horizontal = false;
		c.placeShipAt(row, column, horizontal, ocean);
		c.shootAt(row + 1, column);
		c.shootAt(row, column);
		c.shootAt(row + 2, column);
		boolean actual = c.isSunk();
		assertTrue("Wrong answer", actual);
	}

}
