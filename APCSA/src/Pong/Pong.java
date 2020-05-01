//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable {
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private String scoreString="Left 0 Right 0";
	private int leftScore=0;
	private  int rightScore=0;

	public Pong() {
		// set up all variables related to the game
		
		ball = new Ball(400, 200, 10, 10, Color.RED, 1, 1);

		// instantiate a left Paddle
		leftPaddle = new Paddle(10, 300, 20, 60, Color.BLUE, 3);

		// instantiate a right Paddle

		rightPaddle = new Paddle(750, 300, 20, 60, Color.ORANGE, 3);

		keys = new boolean[4];

		setBackground(Color.WHITE);
		setVisible(true);

		new Thread(this).start();
		addKeyListener(this); // starts the key thread to log key strokes
	}

	public void update(Graphics window) {
		window.drawString(scoreString, 400, 100);
		paint(window);
		window.drawString(scoreString, 400, 100);
		
			
		
		
		
	}

	public void paint(Graphics window) {
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

		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);

		
		// see if ball hits left wall or right wall
		if (!(ball.getX() >= -20 && ball.getX() <= 800)) {
			//ball.setXSpeed(0);
			ball.setYSpeed(0);
			if (ball.getX()>800){
				leftScore++;
			}
			else{
				rightScore++;
			}
			Ball whiteBall = new Ball(ball.getX(), ball.getY(), Color.WHITE, 0, 0);
			whiteBall.draw(window);

			ball.setX(400);
			ball.setY(200);
			
			ball.setYSpeed(1);
			
			scoreString="Left Score "+leftScore+" Right Score "+rightScore;
			System.out.println("here2");
			

		}

		// see if the ball hits the top or bottom wall

		if (!(ball.getY() >= 0 && ball.getY() <= 550)) {
			ball.setYSpeed(-ball.getYSpeed());
		}

		// see if the ball hits the left paddle
		if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed())
				&& (ball.getY() >= leftPaddle.getY() && ball.getY() < leftPaddle.getY() + leftPaddle.getHeight()
						|| ball.getY() + ball.getHeight() >= leftPaddle.getY()
								&& ball.getY() + ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight())) {

			if (ball.getX() <= leftPaddle.getX() + leftPaddle.getX() + leftPaddle.getWidth()
					- Math.abs(ball.getXSpeed())) {

				ball.setXSpeed(-ball.getXSpeed());

			} else {
				ball.setXSpeed(-ball.getXSpeed());
				ball.setYSpeed(-ball.getYSpeed());
			}
		}

		if (ball.getX() - ball.getWidth() >= rightPaddle.getX() - rightPaddle.getWidth() - Math.abs(ball.getXSpeed())
				&& (ball.getY() >= rightPaddle.getY() && ball.getY() < rightPaddle.getY() + rightPaddle.getHeight()
						|| ball.getY() + ball.getHeight() >= rightPaddle.getY()
								&& ball.getY() + ball.getHeight() < rightPaddle.getY() + rightPaddle.getHeight())) {

			if (ball.getX() >= rightPaddle.getX() + rightPaddle.getX() + rightPaddle.getWidth()
					- Math.abs(ball.getXSpeed())) {
				ball.setYSpeed(-ball.getYSpeed());
				ball.setXSpeed(-ball.getXSpeed());

			} else {
				ball.setXSpeed(-ball.getXSpeed());

			}
		}
		
		// see if the ball hits the right paddle

		if (keys[1] == true) {
			// move left paddle up and draw it on the window
			
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if (keys[0] == true) {
			// move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(graphToBack);

		}
		if (keys[3] == true) {
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if (keys[2] == true) {
			rightPaddle.moveDownAndDraw(graphToBack);
		}

		// see if the paddles need to be moved
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = true;
			break;
		case 'Z':
			keys[1] = true;
			break;
		case 'I':
			keys[2] = true;
			break;
		case 'M':
			keys[3] = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = false;
			break;
		case 'Z':
			keys[1] = false;
			break;
		case 'I':
			keys[2] = false;
			break;
		case 'M':
			keys[3] = false;
			break;
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(8);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}