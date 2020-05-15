package PracticeApTest;

public class LightBoard {
	private boolean[][] lights;
	public LightBoard(int numRows, int numCols)
	 {
		for (int r=0; r <numRows; r++){
			for (int c=0;c<numCols;c++){
				int randInt = (int)(Math.random()*10);
				if (randInt<4){
					lights[r][c]=true;
				}
				else{
					lights[r][c]=false;
				}
			}
		}
	 }
	
	public boolean evaluateLight(int row, int col) {
		if (lights[row][col] == true){
			int onCount=0;
			for (int c=0; c<lights[row].length;c++){
				if (lights[row][c]){
					onCount++;
				}
			}
			if (onCount%2==0){
				return false;
			}
			else{
				return true;
			}
		}
		else {
			int onCount=0;
			for (int c=0; c<lights[row].length;c++){
				if (lights[row][c]){
					onCount++;
				}
			}
			if (onCount%3==0){
				return true;
			}
			else{
				return false;
			}
		}
	}
	 
	
}
