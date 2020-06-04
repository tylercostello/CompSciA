package FinalTTT;

import java.util.ArrayList;

public class Leaderboard {
	private ArrayList<Player> leaderboard = new ArrayList<Player>();

	public ArrayList<Player> getLeaderboard() {
		return leaderboard;
	}

	public void setLeaderboard(ArrayList<Player> leaderboard) {
		this.leaderboard = leaderboard;
	}
	
	public void addGame(Player player, boolean wasWin){
		if (searchFor(leaderboard,player.getUsername())==-1){
			leaderboard.add(new Player(player.getUsername(),0,0));
			leaderboard.get(searchFor(leaderboard,player.getUsername())).addGame(wasWin);
		}
		else{
			leaderboard.get(searchFor(leaderboard,player.getUsername())).addGame(wasWin);
		}
	}
	public int searchFor(ArrayList<Player> leaderboard,String playerName){
		  for (int i=0;i<leaderboard.size();i++){
			  if (leaderboard.get(i).getUsername().equals(playerName)){
				  return i;
			  }
		  }
		  return -1;
	  }
	public void displayLeaderboard(){
		for (Player player : leaderboard){
			System.out.println(player.toString());
		}
	}
	public String toString(){
		String returnString="";
		for (Player player : leaderboard){
			returnString+=(player.toString()+"\n");
		}
		return returnString;
	}
}
