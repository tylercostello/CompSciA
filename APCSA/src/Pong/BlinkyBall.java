//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Pong;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{

   //constructors
   public BlinkyBall()
   {
		super(400, 200, 10, 10, Color.RED, 1, 1);
   }

   public BlinkyBall(int x, int y)
   {
	   
	   super(x, y, 10, 10, Color.RED, 1, 1);

   }

   public BlinkyBall(int x, int y, int wid, int ht)
   {

	   super(x, y, wid, ht, Color.RED, 1, 1);

   }

   public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {

	   super(x, y, wid, ht, Color.RED, xSpd, ySpd);	

   }

   public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {


	   super(x, y, wid, ht, col, 1, 1);

   }

   public Color randomColor()
   {
   	int r = 0;		//use Math.random()
 		int g = 0;
 		int b = 0;
 		r=(int)(Math.random()*256);
 		g=(int)(Math.random()*256);
 		b=(int)(Math.random()*256);
 		return new Color(r,g,b);
   }

   public void moveAndDraw(Graphics window)
   {

	   	  Ball whiteBall = new Ball(getX(),getY(),Color.WHITE,0,0);
		  whiteBall.draw(window);
		  this.setColor(randomColor());
	      setX(getX()+getXSpeed());
	      setY(getY()+getYSpeed());
	      this.draw(window);


   }
}