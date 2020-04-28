//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Pong;

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		this.xPos = 100;
		this.yPos = 150;
		this.width = 10;
		this.height = 10;
	}
	public Block(int xPos, int yPos) {
		this.setPos(xPos, yPos);
		this.width = 10;
		this.height = 10;
	}
	public Block(int xPos, int yPos, Color color) {
		this.setPos(xPos, yPos);
		this.setColor(color);
		this.width = 10;
		this.height = 10;
	}

	public Block(int xPos, int yPos, int width, int height) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;

	}

	public Block(int xPos, int yPos, int width, int height, Color color) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		this.color = color;
		// setColor(color);

	}

	// add other Block constructors - x , y , width, height, color
	// add a toString() method - x , y , width, height, color
	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		this.xPos = x;
		this.yPos = y;
	}

	public void setX(int x) {
		// TODO Auto-generated method stub
		this.xPos = x;
	}

	public void setY(int y) {
		// TODO Auto-generated method stub
		this.yPos = y;
	}

	// add the other set methods
	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setColor(Color col) {
		this.color = col;

	}

	public void draw(Graphics window) {

		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());

	}

	public void draw(Graphics window, Color col) {
		this.setColor(col);
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());

	}

	public boolean equals(Object obj) {

		if (this.toString().equals(obj.toString())) {
			return true;
		}

		return false;
	}

	// add the other get methods

	public String toString() {
		return (xPos + " " + yPos + " " + width + " " + height + " " + color);
	}

}