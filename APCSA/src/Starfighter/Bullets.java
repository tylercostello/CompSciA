//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Starfighter;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
		ammo=new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
		
		ammo.add(al);
		
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		
		for (Ammo bullet : ammo){
			bullet.draw(window);
		}
		
	}

	public void moveEmAll()
	{
		
		for (Ammo bullet : ammo){
			bullet.move("UP");
		}
		
	}

	public void cleanEmUp()
	{
		ArrayList<Ammo> aliveList = new ArrayList<Ammo>();
		boolean isAlive=true;
		for (Ammo bullet : ammo){
			
			if (bullet.getX()<0 || bullet.getY()<0){
				isAlive=false;
			}
			if (bullet.getX()>800 || bullet.getY()>600){
				isAlive=false;
			}
			if (isAlive){
				aliveList.add(bullet);
			}
		}
		ammo=aliveList;
		
	}

	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return "";
	}
}
