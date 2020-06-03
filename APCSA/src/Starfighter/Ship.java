//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Starfighter;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   this(x,y,10,10,10);//add code here
	}

	public Ship(int x, int y, int s)
	{
	   this(x,y,10,10,s);//add code here
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		
		try
		{
			File file = new File("C:/Users/tyc64/Desktop/CompSciGithub/CompSciA/APCSA/src/Starfighter/ship.jpg");
			image = ImageIO.read(file);
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
			System.out.println("There was a problem");//feel free to do something here
		}
	}


	public void setSpeed(int s)
	{
		speed=s;
		//add more code
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
		
		if (direction.equals("LEFT")){
			setX(getX()-getSpeed());
		}
		else if (direction.equals("RIGHT")){
			setX(getX()+getSpeed());
		}
		else if (direction.equals("UP")){
			setY(getY()-getSpeed());
		}
		else{
			setY(getY()+getSpeed());
		}
		
		//add code here
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}