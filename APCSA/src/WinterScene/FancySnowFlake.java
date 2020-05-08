//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package WinterScene;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;

public class FancySnowFlake extends AbstractShape {
	
	   public FancySnowFlake(int x, int y, int w, int h )
	   {
			super(x, y, w, h, Color.WHITE, 0, 0);
	   }

	   public void draw(Graphics window)
	   {
	      //add code here to make a snowman 
		   
		   
	   }

	   public void moveAndDraw(Graphics window)
	   {
	      draw(window);   
	   }
}
//extend the AbstractShape class to make a FancySnowFlake class


