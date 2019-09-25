package project_1;

import java.util.ArrayList;

public class GenerateActions {

	private Node currentNode;
	private ArrayList<Node> generatedActions;
	
	private int[] currentState;
	private int positionToMove = 0;
	
	public GenerateActions(Node currentNode) {
		
		this.generatedActions = new ArrayList<Node>();
		this.currentNode = new Node(currentNode.getData(), currentNode.getIdPuzzle());
		this.currentState = currentNode.getData().getPuzzle().clone();
		
	}
	
	private void numActions() {
		
		int[] temp = currentNode.getData().getPuzzle();
		
	}
	
	private void moveLeft() {
		
	}
	private void moveRight() {
		
	}
	private void moveUp() {
		
	}
	private void moveDown() {
		
	}
}
