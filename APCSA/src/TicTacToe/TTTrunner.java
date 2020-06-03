package TicTacToe;
import java.awt.Canvas;

import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.JFrame;

//graphics code taken from starfighter

public class TTTrunner extends JFrame{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 800;
	public TTTrunner(){
		super("Tic Tac Toe");
		setSize(WIDTH,HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Game game = new Game(new Player(), new Player());
		((Component)game).setFocusable(true);

		getContentPane().add(game);

		setVisible(true);
		
//		game.getBoard().displayBoard();
//		game.makeMove(0, 0);
//		game.makeMove(1, 1);
//		game.getBoard().displayBoard();
//		System.out.println(game.getBoard().checkWin());

		
	}
	public static void main(String[] args) {

		
		// TODO Auto-generated method stub
		
		TTTrunner run = new TTTrunner();


		
	}

}


