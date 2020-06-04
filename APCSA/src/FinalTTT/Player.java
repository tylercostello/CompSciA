package FinalTTT;

public class Player {
	int winCount = 0;
	double winPercent = 0;
	// boolean isX=false;
	String username = "";
	int totalGames = 0;

	public Player() {

	}

	public Player(String username) {
		this.username = username;
		// this.isX=isX;
	}

	public Player(String username, int winCount, int totalGames) {
		this.username = username;
		this.winCount = winCount;
		this.totalGames = totalGames;
		winPercent = (double) winCount / totalGames;
		if(Double.isNaN(winPercent)){
			winPercent=0.0;
		}
	}

	public int getWinCount() {
		return winCount;
	}

	public void setWinCount(int winCount) {
		this.winCount = winCount;
	}

	public double getWinPercent() {
		return winPercent;
	}

	public void setWinPercent(double winPercent) {
		this.winPercent = winPercent;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getTotalGames() {
		return totalGames;
	}

	public void setTotalGames(int totalGames) {
		this.totalGames = totalGames;
	}

	public void addGame(boolean wasWin) {
		totalGames++;
		if (wasWin)
			winCount++;
		winPercent = (double) winCount / totalGames;
	}

	public String toString() {
		return getUsername() + " " + getWinCount() + " " + getTotalGames() + " " + getWinPercent();
	}
	public String toCommaString() {
		return getUsername() + "," + getWinCount() + "," + getTotalGames();
	}

}
