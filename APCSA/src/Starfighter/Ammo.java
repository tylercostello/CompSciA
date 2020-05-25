//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Starfighter;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		this(x,y,0);
		//add code
	}

	public Ammo(int x, int y, int s)
	{
		setX(x);
		setY(y);
		speed=s;
		//add code
	}

	public void setSpeed(int s)
	{
		speed=s;
	   //add code
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor( Color.yellow );
		 
		window.fillRect( getX(), getY(), 10, 10 );
		//add code to draw the ammo
	}
	
	
	public void move( String direction )
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
		//add code to draw the ammo
	}

	public String toString()
	{
		return "";
	}
}
