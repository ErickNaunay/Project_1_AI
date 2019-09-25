package project_1;

import java.util.ArrayList;

public class GeneratorPuzzle {

	private ArrayList<Puzzle> array_puzzles;
	
	public GeneratorPuzzle(int numPuzzles) {
		
		array_puzzles = new ArrayList<Puzzle>(numPuzzles);
		
		for (int i = 0; i < numPuzzles; i++) {
			array_puzzles.add(new Puzzle(true));
		}

		//System.out.println("Finish creating the array");
		
	}

	public ArrayList<Puzzle> getArray_puzzles() {
		return array_puzzles;
	}

	public void setArray_puzzles(ArrayList<Puzzle> array_puzzles) {
		this.array_puzzles = array_puzzles;
	}

	
}
