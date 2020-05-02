//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Pong;
import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
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
	public boolean didCollideLeft(Object obj){
		//System.out.println(obj.getClass().toString());
		if (obj.getClass().toString().equals("class Pong.Paddle")){
			//paddle code
			Paddle leftPaddle = (Paddle) obj;
			if (this.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(this.getXSpeed())
			&& (this.getY() >= leftPaddle.getY() && this.getY() < leftPaddle.getY() + leftPaddle.getHeight()
					|| this.getY() + this.getHeight() >= leftPaddle.getY()
							&& this.getY() + this.getHeight() < leftPaddle.getY() + leftPaddle.getHeight())) {
				return true;
			}
		}
		else if (obj.getClass().toString().equals("class Pong.Wall")){
			//wall code
			Wall tempWall = (Wall) obj;
			if (this.getX() <= tempWall.getX()) {
			//if (this.getX()-this.getWidth() <= tempWall.getX()) {
				return true;
			}
		}
		return false;
	}
	public boolean didCollideRight(Object obj){
		if (obj.getClass().toString().equals("class Pong.Paddle")){
			//paddle code
			Paddle rightPaddle = (Paddle) obj;
			if (this.getX() - this.getWidth() >= rightPaddle.getX() - rightPaddle.getWidth() - Math.abs(this.getXSpeed())
					&& (this.getY() >= rightPaddle.getY() && this.getY() < rightPaddle.getY() + rightPaddle.getHeight()
							|| this.getY() + this.getHeight() >= rightPaddle.getY()
									&& this.getY() + this.getHeight() < rightPaddle.getY() + rightPaddle.getHeight())) {
				return true;
			}
		}
		else if (obj.getClass().toString().equals("class Pong.Wall")){
			//wall code
			Wall tempWall = (Wall) obj;
			if (this.getX()>= tempWall.getX()) {
			//if (this.getX() + this.getWidth() >= tempWall.getX()) {
				return true;
			}
		}
		return false;
	}
	public boolean didCollideTop(Object obj){
		Wall tempWall = (Wall) obj;
		if (this.getY() <= tempWall.getY()) {
			//System.out.println(this.getY());
			//System.out.println(tempBlock.getY());
			return true;
		}
		return false;
	}
	public boolean didCollideBottom(Object obj){
		Wall tempWall = (Wall) obj;
		if (this.getY() >= tempWall.getY()) {
			//System.out.println(this.getY());
			//System.out.println(tempBlock.getY());
			return true;
		}
		return false;
	}
	
	
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