package TicTacToe;

import java.util.Arrays;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;


//graphics code taken from starfighter

public class Game extends Canvas implements Runnable, MouseListener{
	private BufferedImage back;
	//X testX = new X(1,0);
	//O testO = new O(1,1);
	int turn=1;
	Board board = new Board();
	public Game(Player player1,Player player2){
		setBackground(Color.white);
		setVisible(true);
		this.addMouseListener(this);
		new Thread(this).start();
		
		
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
	   
	  // System.out.println(((y-40)/200)+" "+x/200);
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
		
		graphToBack.fillRect(200, 50, 25, 500);
		graphToBack.fillRect(400, 50, 25, 500);
		graphToBack.fillRect(50, 200, 500, 25);
		graphToBack.fillRect(50, 400, 500, 25);
		//testX.draw(graphToBack);
		//testO.draw(graphToBack);
		for (int r=0;r<3;r++){
			for (int c=0;c<3;c++){
				if (board.getBoard()[r][c]==1){
					new X(r,c).draw(graphToBack);
				}
				if (board.getBoard()[r][c]==2){
					new O(r,c).draw(graphToBack);
				}
			}
		}
		
		System.out.println(board.checkWin());
		
		
		twoDGraph.drawImage(back, null, 0, 0);

	}

	   public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	    		   Thread.currentThread().sleep(1);
	               repaint();

	           
	         }
	      }catch(Exception e)
	      {
	    	  System.out.println("Error");
	      }
	  	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//Point p = MouseInfo.getPointerInfo().getLocation();
		int x = (int)arg0.getPoint().getX();
		int y = (int)arg0.getPoint().getY();
		//System.out.println(((y-40)/200)+" "+((y-40)/200));
		int row=((y-40)/200);
		int column=x/200;
		//board.displayBoard();
		if(board.makeMove(turn, row, column)){
			invertTurn();
		}
		//board.displayBoard();
		
		
	}
	private void invertTurn(){
		if (turn==1){
			turn=2;
		}
		else{
			turn=1;
		}
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
