package ch8ex8p1;

import java.security.SecureRandom;
import java.awt.Graphics;
import java.awt.Color;

public class MyOval 
{
	private int x;
	private int y;
	private int width;
	private int height;
	private Color color;
	
	private SecureRandom randomNumber = new SecureRandom();
	
	public MyOval(int x, int y, int width, int height, Color color)
	{
		this.x = x;
		this.y = y;
		this.width = width - x;
		this.height = height - y;
		this.color = color;
	}//end constructor
	
	public void draw(Graphics g)
	{
		int drawFlag = randomNumber.nextInt(2);
		if (drawFlag==0)
		{
			g.setColor(color);
			g.drawOval(x, y, width, height);
		}
		else
		{
			g.setColor(color);
			g.fillOval(x, y, width, height);
		}
	}
}//end class