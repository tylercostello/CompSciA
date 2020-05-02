//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Pong;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class Invisiball extends Ball {

	// constructors
	public Invisiball() {
		super(400, 200, 10, 10, Color.RED, 1, 1);
	}

	public Invisiball(int x, int y) {

		super(x, y, 10, 10, Color.RED, 1, 1);

	}

	public Invisiball(int x, int y, int wid, int ht) {

		super(x, y, wid, ht, Color.RED, 1, 1);

	}

	public Invisiball(int x, int y, int wid, int ht, int xSpd, int ySpd) {

		super(x, y, wid, ht, Color.RED, xSpd, ySpd);

	}

	public Invisiball(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {

		super(x, y, wid, ht, col, 1, 1);

	}



	public void moveAndDraw(Graphics window) {

		Ball whiteBall = new Ball(getX(), getY(), Color.WHITE, 0, 0);
		whiteBall.draw(window);
		int randInt=(int)(Math.random()*1000);
		if (randInt<300){
			setColor(Color.WHITE);
		}
		if (randInt>980){
			setColor(Color.RED);
		}
		System.out.println(randInt);
		
		setX(getX() + getXSpeed());
		setY(getY() + getYSpeed());
		
		// System.out.println(getYSpeed());
		this.draw(window);
		

	}
}