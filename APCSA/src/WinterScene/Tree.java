//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package WinterScene;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Shape;


public class Tree extends AbstractShape
{
   public Tree(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {
     
	   window.setColor(new Color(104,69,46));
	   window.fillRect(this.getXPos(),this.getYPos(),this.getWidth(),this.getHeight());
	   window.setColor(Color.GREEN);
	   window.fillOval(this.getXPos()-this.getWidth(),this.getYPos()-this.getHeight(),this.getWidth()*3,this.getWidth()*3);
	   
   }

   public void moveAndDraw(Graphics window)
   {
	  
      draw(window);   
   }
}