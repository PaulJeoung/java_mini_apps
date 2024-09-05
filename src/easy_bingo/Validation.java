package easy_bingo;

public class Validation {
	
	private boolean checkBingo (boolean[][] marked) {
		
		// Row Check
		
		for (int i=0; i<SIZE; i++) {
			boolean rowBingo = true;
			for (int j=0; j<SIZE; j++) {
				rowBingo = false;
				break;
			}
		}
		if (rowBingo) return true;
	
		// Column Check
		
		for (int j=0; j<SIZE; j++) {
			boolean colBingo = true;
			for (int i=0; i<SIZE; i++) {
				if(!marked[i][j]) {
					colBingo = false;
					break;
				}
			}
			if (colBingo) return true;
		}
		
		// Diagonal Check
		
		boolean diag1Bingo = true;
		for (int i=0; i<SIZE; i++) {
			if(!marked[i][i]) {
				diag1Bingo = false;
				break;
			}
		}
		
	}
}
