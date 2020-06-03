package TicTacToe;
//https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/layout/CardLayoutDemoProject/src/layout/CardLayoutDemo.java
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
public class cst {
	  JPanel cards;
	  public static void main(String[] args) {
		  	JFrame frame = new JFrame("CardLayoutDemo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(800,800);
	        cst thecst=new cst();
	        JPanel card1 = new JPanel();
	    
	        card1.add(new JButton("Button 1"));
	        card1.add(new JButton("Button 2"));
	        card1.add(new JButton("Button 3"));
	        JPanel card2 = new JPanel();
	        card2.add(new JTextField("TextField", 20));
	     
	        thecst.cards = new JPanel(new CardLayout());
	        thecst.cards.add(card1,"1");
	        thecst.cards.add(card2,"2");
	        frame.add(thecst.cards, BorderLayout.CENTER);
	        CardLayout cl = (CardLayout)(thecst.cards.getLayout());
	        System.out.println(thecst.cards.getLayout().toString());
	        cl.show(thecst.cards, "2");
	        frame.pack();
	        frame.setVisible(true);
	        
	        
	  }
}
