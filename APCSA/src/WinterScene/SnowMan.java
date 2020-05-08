//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package WinterScene;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class SnowMan extends AbstractShape
{
   public SnowMan(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {
      //add code here to make a snowman 	
	   
	   //window.drawOval(this.getXPos(),this.getYPos(),this.getWidth(),this.getHeight());
	   window.fillOval(this.getXPos(),this.getYPos(),this.getWidth(),this.getHeight());
	   window.fillOval(this.getXPos()+25,this.getYPos()-30,this.getWidth()-50,this.getHeight()-50);
   }

   public void moveAndDraw(Graphics window)
   {
	  this.setXPos(this.getXPos()+this.getXSpeed());
      draw(window);   
   }
}