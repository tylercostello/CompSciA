//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Pong;
import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int xPos,int yPos){
		super(xPos,yPos);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int xPos,int yPos, int width, int height){
		super(xPos,yPos,width,height);
		
	}
	public Ball(int xPos,int yPos,Color col,int xSpeed,int ySpeed){
		super(xPos,yPos,col);
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
		
	}
	public Ball(int xPos,int yPos, int width, int height, Color col){
		super(xPos,yPos,width,height,col);
		
	}
	public Ball(int xPos,int yPos, int width, int height, Color col, int xSpeed, int ySpeed){
		super(xPos,yPos,width,height,col);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	//add the other Ball constructors
	
	public void setXSpeed(int xSpeed){
		this.xSpeed=xSpeed;
	}
	public void setYSpeed(int ySpeed){
		this.ySpeed=ySpeed;
	}
	public int getXSpeed(){
		return xSpeed;
	}
	public int getYSpeed(){
		return ySpeed;
	}
	
	
	
	
	
	
	
	
	
	
	
	   
   //add the set methods
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	  Ball whiteBall = new Ball(getX(),getY(),Color.WHITE,0,0);
	  whiteBall.draw(window);
      setX(getX()+xSpeed);
      setY(getY()+ySpeed);
      this.draw(window);
		//setY

		//draw the ball at its new location
   }
   
	public boolean equals(Object obj)
	{

		if (this.toString().equals(obj.toString())){
			return true;
		}


		return false;
	}   
	public String toString(){
		return super.toString()+" "+xSpeed+" "+ySpeed;
	}

   //add the get methods

  
}