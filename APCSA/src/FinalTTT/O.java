package FinalTTT;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class O extends Move{

	public O(int r, int c) {
		super(r, c);
		// TODO Auto-generated constructor stub
	}

	public void draw(Graphics window){
		int x=this.getX();
		int y=this.getY();
		Graphics2D g2 = (Graphics2D) window;
		g2.setStroke(new BasicStroke(10));
		window.drawOval(x, y, 100, 100);
		//window.fillRect(this.getX(), this.getY(), 100, 100);
	}
}
