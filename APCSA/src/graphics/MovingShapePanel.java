//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -
package graphics;
import java.awt.Font; 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovingShapePanel extends JPanel implements Runnable
{
	private Shape sh;

	public MovingShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);

		//refer sh to a new Shape


		new Thread(this).start();
		sh = new Shape(200,200,10,10,Color.RED,10,10);
	}

	public void update(Graphics window)
	{
		paint(window);

	}

	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);
		window.setColor(Color.RED);
		//window.drawRect(20,20,10,10);
		//window.fillRect(200,200,10, 10);
		
	
		sh.draw(window);
		sh.setX(sh.getX()+sh.getXSpeed());
		sh.setY(sh.getY()+sh.getYSpeed());
		sh.draw(window);
	
		//tell sh to move and draw

		//this code handles the left and right walls
		// uncomment once Shape is built
		
		if(!(sh.getX()>=10 && sh.getX()<=730))
		{
			sh.setXSpeed(-sh.getXSpeed());
		}
		if(!(sh.getY()>=10 && sh.getY()<=500))
		{
			sh.setYSpeed(-sh.getYSpeed());
		}
		
		
		//add code to handle the top and bottom walls

	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(10);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}