package Pong;

import java.awt.Color;

public class Wall extends Block{
	//static Color col = Color.GREEN;
	public Wall(int xPos,int yPos, int width, int height){
		super(xPos,yPos,width,height, Color.RED);
	}

}
