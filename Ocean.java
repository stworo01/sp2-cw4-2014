package stworo01;

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

}
