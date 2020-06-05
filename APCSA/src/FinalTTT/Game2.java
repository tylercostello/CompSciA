package FinalTTT;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Game2 extends JPanel implements Runnable, MouseListener, ActionListener {
	public volatile int scene = 3;
	private BufferedImage back;
	public int gameState;
	private int turn = 1;
	Board board = new Board();

	public Game2(Player player1, Player player2) {
		setBackground(Color.white);
		setVisible(true);
		this.addMouseListener(this);
		new Thread(this).start();

	}

	public int getScene() {
		return scene;
	}

	public void setScene(int newScene) {
		scene = newScene;
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

	// update and paint taken from starfighter
	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		Graphics2D twoDGraph = (Graphics2D) window;
		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));

		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.WHITE);
		graphToBack.fillRect(0, 0, 800, 600);

		sceneThree(graphToBack);

		twoDGraph.drawImage(back, null, 0, 0);

	}

	private void sceneThree(Graphics graphToBack) {
		graphToBack.setColor(Color.BLACK);

		graphToBack.fillRect(200, 50, 25, 500);
		graphToBack.fillRect(400, 50, 25, 500);
		graphToBack.fillRect(50, 200, 500, 25);
		graphToBack.fillRect(50, 400, 500, 25);
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
		if (gameState != 0) {

			board.resetBoard();

			scene = 4;
		}
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

		int row = ((y - 40) / 200);
		int column = x / 200;

		if (gameState == 0) {
			if (board.makeMove(turn, row, column)) {
				invertTurn();
			}
		} else {
			gameState = 0;
			board.resetBoard();
			scene = 3;

		}

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
