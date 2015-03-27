package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import stworo01.Ocean;
import stworo01.Ship;

public class OceanTest {
	
	
	@Test
	// Test Ship array for EmptySea objects
	public void testGetShipArray1() {
		Ocean addobj = new Ocean();
		int expectedOutput = 1;
		Ship[][] actualOutput = addobj.getShipArray();
		int expectedCountOutput = 100;
		int count = 0;
		for (int i = 0; i < actualOutput.length; i++) {
			for (int j = 0; j < actualOutput.length; j++) {
				int output = actualOutput[i][j].getLength();
				assertEquals("wrong answer", expectedOutput, output);
				count++;
			}
		}
		assertEquals("Wrong Count", expectedCountOutput, count);
	}

	@Test
	public void testCreateEmptySea() {
		Ocean o = new Ocean();
		o.createEmptySea();
		Ship[][] temp = o.getShipArray();
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				String actual = temp[i][j].getShipType();
				String expected = "EmptySea";
				assertEquals("Wrong Answer", expected, actual);
			}
		}	
	}


	@Test
	public void testPlaceAllShipsRandomly() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsOccupied() {
		fail("Not yet implemented");
	}

	@Test
	public void testShootAt() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetShotsFired() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHitCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetShipsSunk() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsGameOver() {
		fail("Not yet implemented");
	}

	

	@Test
	public void testPrint() {
		fail("Not yet implemented");
	}

}
