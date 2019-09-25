package project_1;

import java.util.HashMap;

public class Node {
	
	private Puzzle data;
	private int pathCost;
	private String idPuzzle;
	
	private HashMap<String, Node> childNodes;
	
	public Node(Puzzle data, String idPuzzle) {
		
		this.setData(data);
		this.setIdPuzzle(idPuzzle);
		
		childNodes = new HashMap<String, Node>();
	}
	
	public void addNode(Node childNode) {
		
		childNodes.put(childNode.getIdPuzzle(), childNode);
		
	}
	
	public HashMap<String, Node> getChildNodes() {
		return childNodes;
	}

	public void setChildNodes(HashMap<String, Node> childNodes) {
		this.childNodes = childNodes;
	}
	
	public Puzzle getData() {
		return data;
	}

	public void setData(Puzzle data) {
		this.data = new Puzzle(data);
	}

	public int getPathCost() {
		return pathCost;
	}

	public void setPathCost(int pathCost) {
		this.pathCost = pathCost;
	}

	public String getIdPuzzle() {
		return idPuzzle;
	}

	public void setIdPuzzle(String idPuzzle) {
		this.idPuzzle = idPuzzle;
	}
	
	
}
