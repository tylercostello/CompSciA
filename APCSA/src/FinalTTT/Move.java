package FinalTTT;

public class Move {
	int row;
	int column;
	int x;
	int y;

	public Move(int r, int c){
		row=r;
		column=c;
		x=column*200+60;
		y=row*200+60;
	}
	

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
