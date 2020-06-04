package FinalTTT;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class X extends Move{

	public X(int r, int c) {
		super(r, c);
		// TODO Auto-generated constructor stub
	}
	
	public void draw(Graphics window){
		int x=this.getX();
		int y=this.getY();
		Graphics2D g2 = (Graphics2D) window;
		g2.setStroke(new BasicStroke(10));
		window.drawPolygon(new int[]{x,x+100}, new int[]{y,y+100}, 2);
		window.drawPolygon(new int[]{x+100,x}, new int[]{y,y+100}, 2);
		//window.fillRect(this.getX(), this.getY(), 100, 100);
	}

}
