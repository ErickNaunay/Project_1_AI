package project_1;

//import Jama.Matrix;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int modelLength = 100;
		GeneratorPuzzle trainingModel = new GeneratorPuzzle(modelLength);
		
		
		for(Puzzle item: trainingModel.getArray_puzzles()) {
			System.out.println(item);
		}
		*/
		
		Puzzle toSolve = new Puzzle(true);
		System.out.println("Puzzle to solve: Initial state");
		System.out.println(toSolve);
		int idNode = 0;
		
		Node initNode = new Node(toSolve, Integer.toString(idNode));
		
		
		
		
	}

}
