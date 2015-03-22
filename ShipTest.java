package testing;

import static org.junit.Assert.*;
import org.junit.Test;
import stworo01.Battleship;
import stworo01.Cruiser;
import stworo01.Destroyer;
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
		int column = 2;
		boolean horizontal = true;
		boolean actual = h.okToPlaceShipAt(row, column, horizontal, ocean);
		assertTrue("Wrong Answer", actual);
	}

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
		fail("Not yet implemented");
	}

	@Test
	public void testIsSunk() {
		fail("Not yet implemented");
	}

}
