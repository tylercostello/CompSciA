//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Pong;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends BlinkyBall {

	private int prevXSpeed;
	private int prevYSpeed;
	// instance variables

	public SpeedUpBall() {
		super(400, 200, 10, 10, Color.RED, 1, 1);

	}

	public SpeedUpBall(int x, int y) {
		super(x, y, 10, 10, Color.RED, 1, 1);

	}

	public SpeedUpBall(int x, int y, int xSpd, int ySpd) {
		super(x, y, 10, 10, Color.RED, xSpd, ySpd);

	}

	public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
		super(x, y, wid, ht, Color.RED, xSpd, ySpd);

	}

	public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {

		super(x, y, wid, ht, col, xSpd, ySpd);

	}

	public void setXSpeed(int xSpd) {

		super.setXSpeed(xSpd);

	}

	public void setYSpeed(int ySpd) {

		super.setYSpeed(ySpd);

	}

	@Override
	public void moveAndDraw(Graphics window) {
//		if (prevXSpeed == -this.getXSpeed() || prevYSpeed == -this.getYSpeed()) {
//			// collided
//			System.out.println("Collided");
//			this.setXSpeed(this.getXSpeed() + this.getXSpeed()/Math.abs(this.getXSpeed()) );
//			this.setYSpeed(this.getYSpeed() + this.getYSpeed()/Math.abs(this.getYSpeed()));
//		}

		super.moveAndDraw(window);
		prevXSpeed = this.getXSpeed();
		prevYSpeed = this.getYSpeed();

	}
}
