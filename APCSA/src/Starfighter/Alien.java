//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Starfighter;
import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(0,0,30,30,0);
	}

	public Alien(int x, int y)
	{
		this(x,y,30,30,0);
		//add code here
	}

	public Alien(int x, int y, int s)
	{
		this(x,y,30,30,s);
		//add code here
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			File file = new File("C:/Users/tyc64/Desktop/CompSciGithub/CompSciA/APCSA/src/Starfighter/alien.jpg");
			image = ImageIO.read(file);
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
			System.out.println("There was a problem");
			//feel free to do something here
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
