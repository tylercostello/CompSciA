//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Pong;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {
	// instance variables
	private int speed;

	public Paddle() {
		super(10, 10);
		speed = 5;
	}

	public Paddle(int xPos, int yPos) {
		super(xPos, yPos);
		speed = 5;
	}

	public Paddle(int xPos, int yPos, int width) {
		super(xPos, yPos, width, 50);
		speed = 5;
	}

	public Paddle(int xPos, int yPos, int width) {
		super(xPos, yPos, width, 50);
		speed = 5;
	}

	public Paddle(int xPos, int yPos, int width, int height) {
		super(xPos, yPos, width, height);
		speed = 5;
	}

	public Paddle(int xPos, int yPos, int width, int height, Color col) {
		super(xPos, yPos, width, height, col);
		speed = 5;
	}

	public Paddle(int xPos, int yPos, int width, int height, Color col, int speed) {
		super(xPos, yPos, width, height, col);
		this.speed = speed;
	}

	public Paddle(int xPos, int yPos, int width, int height, int speed) {
		super(xPos, yPos, width, height);
		this.speed = speed;
	}
	

	public void moveUpAndDraw(Graphics window) {
		Paddle whitePaddle = new Paddle(getX(), getY(), getWidth(),getHeight(), Color.WHITE,0);
		whitePaddle.draw(window);
		setY(getY() + speed);
		this.draw(window);

	}

	public void moveDownAndDraw(Graphics window) {
		Paddle whitePaddle = new Paddle(getX(), getY(), getWidth(),getHeight(), Color.WHITE,0);
		whitePaddle.draw(window);
		setY(getY() - speed);
		this.draw(window);
	}

	public int getSpeed() {
		return speed;
	}
	// add get methods

	// add a toString() method
	public String toString() {
		return super.toString() + " " + speed;
	}
}