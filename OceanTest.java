package testing;

//import stworo01.Battleship;
//import stworo01.Cruiser;
//import stworo01.Destroyer;
import stworo01.Ocean;
import stworo01.Ship;
//import stworo01.Submarine;
/**
 * @author Stefan Tworogal
 *
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class OceanTest {

	@Test
	// Test Ship array for EmptySea objects
	public void test() {
		Ocean addobj = new Ocean();
		int expectedOutput = 1;
		Ship[][] actualOutput = addobj.getShipArray();
		int count = 0;
		for (int i = 0; i < actualOutput.length; i++) {
			for (int j = 0; j < actualOutput.length; j++) {
				int output = actualOutput[i][j].getLength();
				assertEquals("wrong answer", expectedOutput, output);
				count++;
			}
		}
		System.out.print(count);// confirm checked whole array 
	}

}
