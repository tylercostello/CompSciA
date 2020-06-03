package TicTacToe;
//https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/layout/CardLayoutDemoProject/src/layout/CardLayoutDemo.java
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
public class ttt2 {
	  private static JPanel cards;
	  public static void main(String[] args) {
		  	JFrame frame = new JFrame("Tic Tac Toe");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(800,800);
	        
	        JPanel card1 = new JPanel();
	        card1.add(new JButton("New Game"));
	        card1.add(new JButton("Leaderboard"));
	        
	        JPanel card2 = new JPanel();
	        card2.add(new JTextField("Player1", 20));
	        card2.add(new JTextField("Player2", 20));
	        
	        
	        JPanel card3 = new JPanel();
	        card3.setLayout(new GridLayout(1,1));
	        //card3.setSize(800,800);
	      //  card3.setLocationRelativeTo(null);
	      //0  card3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Game game = new Game(new Player(), new Player());
			((Component)game).setFocusable(true);

			card3.add(game, BorderLayout.CENTER);

			
	        
	        
	        cards = new JPanel(new CardLayout());
	        cards.add(card1,"1");
	        cards.add(card2,"2");
	        cards.add(card3,"3");
	        frame.add(cards, BorderLayout.CENTER);
	        CardLayout cl = (CardLayout)(cards.getLayout());
	        //System.out.println(cards.getLayout().toString());
	        cl.show(cards, "3");

	        frame.setVisible(true);
	        
	        
	  }
}
