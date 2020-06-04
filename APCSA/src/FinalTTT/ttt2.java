package FinalTTT;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ttt2 {
	private static JPanel cards;
	private static JButton b1, b2, b3, b4, b5, b6, b7;
	private static JTextField t1, t2;
	private static JTextArea l1, l2;
	private static Game2 game;
	private static Player p1, p2;
	private static boolean gameFlag;

	public static void main(String[] args) {
		gameFlag = false;
		Leaderboard leaderboard = new Leaderboard();
		try {
			leaderboard.initializeLeaderboard();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Source for card code
		// https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/layout/CardLayoutDemoProject/src/layout/CardLayoutDemo.java

		JFrame frame = new JFrame("Tic Tac Toe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		game = new Game2(new Player(), new Player());
		JPanel card1 = new JPanel();

		b1 = new JButton("New Game");

		card1.add(b1);
		b6 = new JButton("Leaderboard");
		card1.add(b6);

		JPanel card2 = new JPanel();
		t1 = new JTextField("Player1", 20);
		t2 = new JTextField("Player2", 20);
		card2.add(t1);
		card2.add(t2);

		b4 = new JButton("Submit");
		card2.add(b4);

		JPanel card3 = new JPanel();
		card3.setLayout(new GridLayout(1, 1));


		JPanel card4 = new JPanel();
		b3 = new JButton("New Game");
		b7 = new JButton("Leaderboard");
		card4.add(b3);
		card4.add(b7);
		l1 = new JTextArea("");
		JPanel card5 = new JPanel();
		b5 = new JButton("Back");
		card5.add(b5);
		l2 = new JTextArea("");

		cards = new JPanel(new CardLayout());
		cards.add(card1, "1");
		cards.add(card2, "2");
		cards.add(card3, "3");
		cards.add(card4, "4");
		cards.add(card5, "5");
		frame.add(cards, BorderLayout.CENTER);
		CardLayout cl = (CardLayout) (cards.getLayout());
		cl.show(cards, "1");

		frame.setVisible(true);

		// Source for button code
		// https://www.tutorialspoint.com/swing/swing_jbutton.htm

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!gameFlag) {
					cl.show(cards, "2");
				} else {
					cl.show(cards, "3");
				}
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "3");
			}
		});
		// submit button
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameFlag = true;
				p1 = new Player(t1.getText());

				p2 = new Player(t2.getText());

				cl.show(cards, "3");
				game = new Game2(p1, p2);
				((Component) game).setFocusable(true);

				card3.add(game, BorderLayout.CENTER);
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "1");
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card5.remove(l2);
				l2.setText(leaderboard.toString());
				card5.add(l2);
				cl.show(cards, "5");
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card5.remove(l2);
				l2.setText(leaderboard.toString());
				card5.add(l2);
				cl.show(cards, "5");
			}
		});

		while (true) {
			if (game.scene == 4) {
				game.scene = 3;
				

				int gameEnd = game.gameState;
				String gameString = "";
				if (gameEnd == 1) {
					gameString = " " + p1.getUsername() + " wins";
					leaderboard.addGame(p1, true);
					leaderboard.addGame(p2, false);
					
				} else if (gameEnd == 2) {
					gameString = " " + p2.getUsername() + " wins";
					leaderboard.addGame(p1, false);
					leaderboard.addGame(p2, true);
					

				} else {
					gameString = " Stalemate";
					leaderboard.addGame(p1, false);
					leaderboard.addGame(p2, false);
					

				}
				try {
					leaderboard.saveLeaderboard();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				card4.remove(l1);
				l1.setText("Game Over" + gameString);
				card4.add(l1);

				cl.show(cards, "4");

			}
		}

	}

}
