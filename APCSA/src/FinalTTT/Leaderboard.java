package FinalTTT;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Leaderboard {
	private ArrayList<Player> leaderboard = new ArrayList<Player>();

	public void initializeLeaderboard() throws FileNotFoundException {
		// https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
		File file = new File("C:/Users/tyc64/Desktop/CompSciGithub/CompSciA/APCSA/src/FinalTTT/Leaderboard.txt");
		Scanner sc = new Scanner(file);

		String[] temp = null;
		while (sc.hasNextLine()) {
			temp = sc.nextLine().split(",");
			leaderboard.add(new Player(temp[0], Integer.valueOf(temp[1]), Integer.valueOf(temp[2])));
		}
	}

	public void saveLeaderboard() throws IOException {
		PrintWriter myWriter = new PrintWriter(
				"C:/Users/tyc64/Desktop/CompSciGithub/CompSciA/APCSA/src/FinalTTT/Leaderboard.txt");
		myWriter.write(toCommaString());
		myWriter.close();
	}

	public ArrayList<Player> getLeaderboard() {
		return leaderboard;
	}

	public void setLeaderboard(ArrayList<Player> leaderboard) {
		this.leaderboard = leaderboard;
	}

	public void addGame(Player player, boolean wasWin) {
		if (searchFor(leaderboard, player.getUsername()) == -1) {
			leaderboard.add(new Player(player.getUsername(), 0, 0));
			leaderboard.get(searchFor(leaderboard, player.getUsername())).addGame(wasWin);
		} else {
			leaderboard.get(searchFor(leaderboard, player.getUsername())).addGame(wasWin);
		}
	}

	public int searchFor(ArrayList<Player> leaderboard, String playerName) {
		for (int i = 0; i < leaderboard.size(); i++) {
			if (leaderboard.get(i).getUsername().equals(playerName)) {
				return i;
			}
		}
		return -1;
	}

	public void displayLeaderboard() {
		for (Player player : leaderboard) {
			System.out.println(player.toString());
		}
	}

	public String toString() {
		String returnString = "";
		for (Player player : leaderboard) {
			returnString += (player.toString() + "\n");
		}
		return returnString;
	}

	public String toCommaString() {
		String returnString = "";
		for (Player player : leaderboard) {
			returnString += (player.toCommaString() + "\n");
		}
		return returnString;
	}
}
