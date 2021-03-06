//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Starfighter;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private Ammo ammo;
	private AlienHorde horde;
	private Bullets shots;
	private int ammoDelay;
	private int alienCounter;

	/* uncomment once you are ready for this part
	 *
   
	
	*/

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);
		horde = new AlienHorde(20);
		keys = new boolean[5];
		ship = new Ship(300,500,50,50,1);
		shots = new Bullets();
//		alienOne = new Alien(50,50,50,50,10);
//		alienTwo = new Alien(200,50,50,50,10);
		//ammo = new Ammo(100,0,0);
		//instantiate other instance variables
		//Ship, Alien

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		System.out.println("e");
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		if(keys[2] == true)
		{
			ship.move("UP");
		}
		if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		if(keys[4] == true)
		{
			if (ammoDelay>=100){
				shots.add(new Ammo((int)(ship.getX()+0.5*ship.getWidth()),ship.getY(),10));
				ammoDelay=0;
			}
			//ammo.setX((int)(ship.getX()+0.5*ship.getWidth()));
			//ammo.setY(ship.getY());
			//ammo.setSpeed(10);
		}

		//add code to move Ship, Alien, etc.


		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship

//		if (ammo.getX()>=alienOne.getX() && ammo.getX()<=alienOne.getX()+alienOne.getWidth()){
//				if (ammo.getY()>=alienOne.getY() &&  ammo.getY()<=alienOne.getY()+alienOne.getHeight()){
//					System.out.println("Collision");
//				}
//		
//		}
		alienCounter++;
		ammoDelay++;
		twoDGraph.drawImage(back, null, 0, 0);
		ship.draw(window);
		horde.removeDeadOnes(shots.getList());
		if(alienCounter>=10){
			horde.moveEmAll();
			alienCounter=0;
		}
		horde.drawEmAll(window);
		shots.cleanEmUp();
		shots.moveEmAll();
		shots.drawEmAll(window);
//		alienOne.draw(window);
//		alienTwo.draw(window);
		//ammo.move("UP");
		//ammo.draw(window);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

