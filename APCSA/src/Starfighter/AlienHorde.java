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

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens=new ArrayList<Alien>();
		for (int i=0;i<size;i++){
			aliens.add(new Alien(i%10*80,(i/10)*100+50,1));
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien al : aliens){
			al.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Alien al : aliens){
			al.move("DOWN");
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		ArrayList<Alien> livingAliens = new ArrayList<Alien>();
		boolean isAlive=true;
		for (Alien alien : aliens){
			isAlive=true;
			for (Ammo ammo : shots){
				if (ammo.getX()>=alien.getX() && ammo.getX()<=alien.getX()+alien.getWidth()){
					if (ammo.getY()>=alien.getY() &&  ammo.getY()<=alien.getY()+alien.getHeight()){
						isAlive=false;
						//System.out.println("collision");
					}
			
				}
			}
			if (isAlive){
				livingAliens.add(alien);
			}
		}
		
		aliens=livingAliens;
		
	}

	public String toString()
	{
		return "";
	}
}
