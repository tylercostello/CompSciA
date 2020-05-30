package TicTacToe;

public class Player {
	int winCount=0;
	double winPercent=0;
	boolean isX=false;
	String username="";
	int totalGames=0;
	public Player(){

	}
	public Player(String username, boolean isX){
		this.username=username;
		this.isX=isX;
	}
	public Player(String username, int winCount, int totalGames){
		this.username=username;
		this.winCount=winCount;
		this.totalGames=totalGames;
		winPercent=(double)winCount/totalGames;
	}
	public void addGame(boolean wasWin){
		totalGames++;
		if (wasWin)
			winCount++;
		winPercent=(double)winCount/totalGames;
	}
	
	
}
