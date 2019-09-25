package project_1;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Puzzle {
	
	private int[] puzzle = new int[8];
	
	private final int[] initConfig = {1,2,3,4,5,6,7,8,0};	
	
	private boolean solvable = false;
	
	//When creating a brand new Puzzle, it generates a solvable puzzle shuffled
	public Puzzle() {
		
		setPuzzle(initConfig);
			
		shuffle();
		
		setSolvable(isSolvable());
		
	}
	
	public Puzzle(boolean status) {
		
		setPuzzle(initConfig);
		
		shuffle();
		
		setSolvable(isSolvable());
		
		while(status != getSolvable()) {
			shuffle();
			setSolvable(isSolvable());
		}
			
	}
	
	public Puzzle(int[] config) {
		
		setPuzzle(config);
		setSolvable(isSolvable());
		
	}
	
	public Puzzle(Puzzle copyPuzzle) {
		setPuzzle(copyPuzzle.getPuzzle());
		setSolvable(copyPuzzle.getSolvable());
	}

	public int[] getPuzzle() {
		return puzzle;
	}

	private void setPuzzle(int[] puzzle) throws NullPointerException{
		
		if (puzzle == null)
			throw new NullPointerException("Puzzle can not be created with a NULL Object");
		
		this.puzzle = puzzle.clone();

	}
	
	public boolean getSolvable() {
		return solvable;
	}

	private void setSolvable(boolean solvable) {
		this.solvable = solvable;
	}
	
	//shuffles the init config until a solvable puzzle comes out
	private void shuffle() {
		
		int length = puzzle.length;
		
		int[] a = new int[length];
        int[] ind = new int[length];
        
        for (int i = 0; i < length; i++) {
            ind[i] = 0;
        }
        
        SecureRandom rand = new SecureRandom();
        int index;
        
        for (int i = 0; i < length; i++) {
            do {
                index = rand.nextInt(length);
            } while (ind[index] != 0);

            ind[index] = 1;
            a[i] = puzzle[index];
        }
        
        puzzle = a.clone();
        
	}
	
	private int getInvCount() {
		
        Integer inv_array[] = Arrays.stream(puzzle).boxed().filter(x -> x != 0).collect(Collectors.toList()).toArray(Integer[]::new);
        int inv_count = 0;
        int length = inv_array.length;
        
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (inv_array[i] > inv_array[j]) {
                    inv_count++;
                }
            }
        }
        return inv_count;
	}
	
	public boolean isSolvable() {
		
		if (getInvCount() % 2 == 0)
			return true;
		
		return false;
		
	}
	
	public void makeSolvable() {
		
		while(!getSolvable()) {
			
			shuffle();
			
			if (isSolvable())
				setSolvable(true);
		}
		
	}
	
	@Override
	public String toString() {
		
		String print = "";
		
		print = String.format("Puzzle: %b\n[%d , %d , %d]\n[%d , %d , %d]\n[%d , %d , %d]\n", getSolvable(),
				puzzle[0], puzzle[1], puzzle[2],
				puzzle[3], puzzle[4], puzzle[5],
				puzzle[6], puzzle[7], puzzle[8]);
		
		return print;
	}
}
