package TicTacToe;

import java.util.Arrays;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;


//graphics code taken from starfighter

public class Game extends Canvas{
	private BufferedImage back;
	int turn=1;
	Board board = new Board();
	public Game(Player player1,Player player2){
		setBackground(Color.white);
		setVisible(true);
	}
	public Board getBoard(){
		return board;
	}
	public boolean makeMove(int r,int c){
		if(board.makeMove(turn, r, c)){
			turn++;
			return true;
		}
		return false;
		
	}

	

   public void update(Graphics window)
   {
	   System.out.println("hey");
	   paint(window);
   }
	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.WHITE);
		graphToBack.fillRect(0,0,800,600);
		graphToBack.setColor(Color.BLACK);
		
		//add graphics code here
		
		graphToBack.fillRect(300, 100, 25, 400);
		graphToBack.fillRect(500, 100, 25, 400);
		graphToBack.fillRect(300, 100, 400, 25);
		graphToBack.fillRect(300, 300, 400, 25);
		
		
		
		
		twoDGraph.drawImage(back, null, 0, 0);
	}
	
	   public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	           
	         }
	      }catch(Exception e)
	      {
	      }
	  	}
	
	
}
