package TicTacToe;
//https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/layout/CardLayoutDemoProject/src/layout/CardLayoutDemo.java
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
public class ttt2 {
	  private static JPanel cards;
	 private static JButton b1,b2,b3,b4;
	 private static JTextField t1,t2;
	 private static JLabel l1;
	 private static Game2 game;
	 private static Player p1,p2;
	  public static void main(String[] args) {
		  	ArrayList<Player> leaderboard = new ArrayList<Player>();
		  	//leaderboard.add(new Player("test1"));
		  	//System.out.println(searchFor(leaderboard,"test2"));
		  	
		  	
		  	JFrame frame = new JFrame("Tic Tac Toe");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(800,800);
	        game=new Game2(new Player(), new Player());
	        JPanel card1 = new JPanel();
	       // card1.add(new Button("New Game"));
	        b1=new JButton("New Game");
	        
	        card1.add(b1);
	        card1.add(new JButton("Leaderboard"));
	        
	        JPanel card2 = new JPanel();
	        t1=new JTextField("Player1", 20);
	        t2=new JTextField("Player2", 20);
	        card2.add(t1);
	        card2.add(t2);
	        //card2.add(new JTextField("Player2", 20));
	        b4=new JButton("Submit");
	        card2.add(b4);
	        
	        JPanel card3 = new JPanel();
	        card3.setLayout(new GridLayout(1,1));
	        //card3.setSize(800,800);
	      //  card3.setLocationRelativeTo(null);
	      //  card3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			

			 JPanel card4 = new JPanel();
			 b3=new JButton("New Game");
			 card4.add(b3);
			 l1=new JLabel("");
			 //card4.add(new JLabel("Game Over"));
			
	        
	        cards = new JPanel(new CardLayout());
	        cards.add(card1,"1");
	        cards.add(card2,"2");
	        cards.add(card3,"3");
	        cards.add(card4,"4");
	        frame.add(cards, BorderLayout.CENTER);
	        CardLayout cl = (CardLayout)(cards.getLayout());
	        //System.out.println(cards.getLayout().toString());
	        cl.show(cards, "1");

	        frame.setVisible(true);
	        //https://www.tutorialspoint.com/swing/swing_jbutton.htm

	        b1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	//System.out.println("here");
	            	cl.show(cards, "2");
	            }          
	         });
	        b3.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	//System.out.println("here");
	            	cl.show(cards, "3");
	            }          
	         });
	        //submit button
	        b4.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	//System.out.println("here");
	            	p1=new Player(t1.getText());
	            	System.out.println(t1.getText());
	            	
	            	p2=new Player(t2.getText());
	            	System.out.println(t2.getText());
	            	
	            	
	            	cl.show(cards, "3");
	            	game = new Game2(p1, p2);
	    			((Component)game).setFocusable(true);

	    			card3.add(game, BorderLayout.CENTER);
	            }          
	         });
	        
	        
	       
	        
	        
	        while (true){
	        	if (game.scene==4){
	        		game.scene=3;
	        		//System.out.println("here2");
	        		//System.out.println(game.gameState);
	        		
	        		int gameEnd=game.gameState;
	        		String gameString="";
	        		if (gameEnd==1){
	        			gameString=" "+p1.getUsername()+" wins";
	        			if (searchFor(leaderboard,p1.getUsername())==-1){
	        				leaderboard.add(new Player(p1.getUsername(),0,0));
	        				leaderboard.get(searchFor(leaderboard,p1.getUsername())).addGame(true);
	        			}
	        			else{
	        				leaderboard.get(searchFor(leaderboard,p1.getUsername())).addGame(true);
	        			}
	        			
	        			if (searchFor(leaderboard,p2.getUsername())==-1){
	        				leaderboard.add(new Player(p2.getUsername(),0,0));
	        				leaderboard.get(searchFor(leaderboard,p2.getUsername())).addGame(false);
	        			}
	        			else{
	        				leaderboard.get(searchFor(leaderboard,p2.getUsername())).addGame(false);
	        			}
	        			
	        			//gameString=" X wins";
	        		}
	        		else if (gameEnd==2){
	        			gameString=" "+p2.getUsername()+" wins";
	        			//gameString=" O wins";
	        			if (searchFor(leaderboard,p1.getUsername())==-1){
	        				leaderboard.add(new Player(p1.getUsername(),0,0));
	        				leaderboard.get(searchFor(leaderboard,p1.getUsername())).addGame(false);
	        			}
	        			else{
	        				leaderboard.get(searchFor(leaderboard,p1.getUsername())).addGame(false);
	        			}
	        			
	        			if (searchFor(leaderboard,p2.getUsername())==-1){
	        				leaderboard.add(new Player(p2.getUsername(),0,0));
	        				leaderboard.get(searchFor(leaderboard,p2.getUsername())).addGame(true);
	        			}
	        			else{
	        				leaderboard.get(searchFor(leaderboard,p2.getUsername())).addGame(true);
	        			}
	        			
	        		}
	        		else {
	        			gameString=" Stalemate";
	        			
	        			if (searchFor(leaderboard,p1.getUsername())==-1){
	        				leaderboard.add(new Player(p1.getUsername(),0,0));
	        				leaderboard.get(searchFor(leaderboard,p1.getUsername())).addGame(false);
	        			}
	        			else{
	        				leaderboard.get(searchFor(leaderboard,p1.getUsername())).addGame(false);
	        			}
	        			
	        			if (searchFor(leaderboard,p2.getUsername())==-1){
	        				leaderboard.add(new Player(p2.getUsername(),0,0));
	        				leaderboard.get(searchFor(leaderboard,p2.getUsername())).addGame(false);
	        			}
	        			else{
	        				leaderboard.get(searchFor(leaderboard,p2.getUsername())).addGame(false);
	        			}
	        		}
	        		card4.remove(l1);
	        		l1.setText("Game Over"+gameString);
	        		card4.add(l1);
	        		
	        		cl.show(cards, "4");
	        		
	        	}
	        }
	        
	  }
	  public static int searchFor(ArrayList<Player> leaderboard,String playerName){
		  for (int i=0;i<leaderboard.size();i++){
			  if (leaderboard.get(i).getUsername().equals(playerName)){
				  return i;
			  }
		  }
		  return -1;
	  }
	  
	  
	  
	  
	  
}
class Game2 extends JPanel implements Runnable, MouseListener,ActionListener {
	public volatile int scene=3;
	private BufferedImage back;
	public int gameState;
	// X testX = new X(1,0);
	// O testO = new O(1,1);
	private int turn = 1;
	Board board = new Board();

	public Game2(Player player1, Player player2) {
		setBackground(Color.white);
		setVisible(true);
		this.addMouseListener(this);
		new Thread(this).start();
		

	}
	public int getScene(){
		return scene;
	}
	public void setScene(int newScene){
		scene=newScene;
	}
	
	public Board getBoard() {
		return board;
	}

	public boolean makeMove(int r, int c) {
		if (board.makeMove(turn, r, c)) {
			turn++;
			return true;
		}
		return false;

	}

	public void update(Graphics window) {

		// System.out.println(((y-40)/200)+" "+x/200);
		paint(window);
	}

	public void paint(Graphics window) {
		//System.out.println("e");
		// set up the double buffering to make the game animation nice and
		// smooth
		Graphics2D twoDGraph = (Graphics2D) window;

		// take a snap shop of the current screen and same it as an image
		// that is the exact same width and height as the current screen
		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));

		// create a graphics reference to the back ground image
		// we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.WHITE);
		graphToBack.fillRect(0, 0, 800, 600);
		
		if(scene==1){
			sceneOne(graphToBack);
		}
		else if(scene==2){
			
		}
		else if(scene==3){
			sceneThree(graphToBack);
		}
		else if (scene==4){
			sceneFour(graphToBack);
		}
		/*
		if (gameState == 0) {
			sceneThree(graphToBack);	
		}
		
		else{
			sceneFour(graphToBack);
		}
		*/
		
		
		/*
		if (gameState == 0) {
			graphToBack.setColor(Color.BLACK);

			// add graphics code here

			graphToBack.fillRect(200, 50, 25, 500);
			graphToBack.fillRect(400, 50, 25, 500);
			graphToBack.fillRect(50, 200, 500, 25);
			graphToBack.fillRect(50, 400, 500, 25);
			// testX.draw(graphToBack);
			// testO.draw(graphToBack);
			for (int r = 0; r < 3; r++) {
				for (int c = 0; c < 3; c++) {
					if (board.getBoard()[r][c] == 1) {
						new X(r, c).draw(graphToBack);
					}
					if (board.getBoard()[r][c] == 2) {
						new O(r, c).draw(graphToBack);
					}
				}
			}
		} else {
			graphToBack.setColor(Color.BLACK);
			graphToBack.drawString("Game Over", 300, 300);
			if (gameState==1){
			graphToBack.drawString("X wins", 300, 325);
			}
			else if (gameState==2){
				graphToBack.drawString("O wins", 300, 325);
			}
			else if (gameState==3){
				graphToBack.drawString("Stalemate", 300, 325);
			}
			graphToBack.drawString("Click Anywhere to Play Again", 300, 350);
		}
		*/
		
		

		//gameState = board.checkWin();
		//System.out.println(1);

		twoDGraph.drawImage(back, null, 0, 0);
		//System.out.println("here");

	}
	private void sceneOne(Graphics graphToBack){

	}
	private void sceneTwo(Graphics graphToBack){
		
	}
	private void sceneThree(Graphics graphToBack){
		graphToBack.setColor(Color.BLACK);

		// add graphics code here

		graphToBack.fillRect(200, 50, 25, 500);
		graphToBack.fillRect(400, 50, 25, 500);
		graphToBack.fillRect(50, 200, 500, 25);
		graphToBack.fillRect(50, 400, 500, 25);
		// testX.draw(graphToBack);
		// testO.draw(graphToBack);
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				if (board.getBoard()[r][c] == 1) {
					new X(r, c).draw(graphToBack);
				}
				if (board.getBoard()[r][c] == 2) {
					new O(r, c).draw(graphToBack);
				}
			}
		}
		gameState = board.checkWin();
		if (gameState!=0){
			//gameState=0;
			
			board.resetBoard();
			//scene=3;
			scene=4;
		}
	}
	
	private void sceneFour(Graphics graphToBack){
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawString("Game Over", 300, 300);
		if (gameState==1){
		graphToBack.drawString("X wins", 300, 325);
		}
		else if (gameState==2){
			graphToBack.drawString("O wins", 300, 325);
		}
		else if (gameState==3){
			graphToBack.drawString("Stalemate", 300, 325);
		}
		graphToBack.drawString("Click Anywhere to Play Again", 300, 350);
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(1);
				repaint();

			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int x = (int) arg0.getPoint().getX();
		int y = (int) arg0.getPoint().getY();
		// System.out.println(((y-40)/200)+" "+((y-40)/200));
		int row = ((y - 40) / 200);
		int column = x / 200;
		// board.displayBoard();
		if (gameState == 0) {
			if (board.makeMove(turn, row, column)) {
				invertTurn();
			}
		}
		else{
			gameState=0;
			board.resetBoard();
			scene=3;
			//System.out.println("here");
		}
		// board.displayBoard();

	}

	private void invertTurn() {
		if (turn == 1) {
			turn = 2;
		} else {
			turn = 1;
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

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

