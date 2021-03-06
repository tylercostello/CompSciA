package FrqPractice;

public class onedashthree {
	private int getIndexForFit (NumberTile tile){
		if (board.size()==0){
			return 0;
		}
		for (int i = 0; i <board.size()-1; i++){
			if (board.get(i).getRight()==tile.getLeft() && board.get(i+1).getLeft() == tile.getRight()){
				return i;
			}
		}
		if (board.get(board.size()-1).getRight() == tile.getLeft()){
			return board.size()-1;
		}
		else{
			return -1;
		}
	}
	
	public boolean insertTile(NumberTile tile)
	{
		int spot = 0;
		if (board.size()==0){
			board.add(tile);
			return true;
		}
		for (int i = 0; i<4;i++){
			spot=board.getIndexForFit(tile);
			if (spot!=-1){
				board.add(spot, tile);
				return true;
			}
			else {
				tile.rotate();
			}
		}
		return false;
	}
}
