//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  
package Unit7;
import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
			response=keyboard.next().charAt(0);
			//System.out.println(response);
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors();		
			game.setPlayers(""+response);
			//System.out.println(response);
			System.out.println(game.determineWinner());
			//System.out.println(response);
	}
}
//Output
//type in your prompt [R,P,S] :: R
//R
//P
//Computer Wins



