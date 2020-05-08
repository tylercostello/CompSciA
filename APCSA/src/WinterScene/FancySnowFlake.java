//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package WinterScene;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;


public class FancySnowFlake extends AbstractShape {
	
	   public FancySnowFlake(int x, int y, int w, int h , int ySpeed)
	   {
			super(x, y, w, h, Color.WHITE, 0, ySpeed);
			 
	   }
	   

	   public void draw(Graphics window)
	   {
	      //add code here to make a snowflake 
		   int w = this.getWidth();
		   int h = this.getHeight();
		   
		   
		   window.drawPolygon(new int[]{this.getXPos(),this.getXPos()+w/2,this.getXPos()+w,this.getXPos()+w/2}, new int[]{this.getYPos(),this.getYPos()+h/2,this.getYPos(),this.getYPos()-h/2}, 4);
		   
		   window.drawPolygon(new int[]{this.getXPos()+w,this.getXPos()+w/2+w,this.getXPos()+w+w,this.getXPos()+w/2+w}, new int[]{this.getYPos()-h,this.getYPos()+h/2-h,this.getYPos()-h,this.getYPos()-h/2-h}, 4);
		   
		   window.drawPolygon(new int[]{this.getXPos()+w,this.getXPos()+w/2+w,this.getXPos()+w+w,this.getXPos()+w/2+w}, new int[]{this.getYPos(),this.getYPos()+h/2,this.getYPos(),this.getYPos()-h/2}, 4);
		   
		   window.drawPolygon(new int[]{this.getXPos()+2*w,this.getXPos()+w/2+2*w,this.getXPos()+w+2*w,this.getXPos()+w/2+2*w}, new int[]{this.getYPos(),this.getYPos()+h/2,this.getYPos(),this.getYPos()-h/2}, 4);
		   
		   window.drawPolygon(new int[]{this.getXPos()+w,this.getXPos()+w/2+w,this.getXPos()+w+w,this.getXPos()+w/2+w}, new int[]{this.getYPos()+h,this.getYPos()+h/2+h,this.getYPos()+h,this.getYPos()-h/2+h}, 4);
	   }

	   public void moveAndDraw(Graphics window)
	   {
		  this.setYPos(this.getYPos()+this.getYSpeed());
		  if (this.getYPos()>=600){
			  this.setYPos(0);
		  }
	      draw(window);   
	   }
}
//extend the AbstractShape class to make a FancySnowFlake class


