package ch8ex8p1;

import java.security.SecureRandom;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class DrawShape extends JPanel
{
	private SecureRandom randomNumbers = new SecureRandom();
	private int x;
	private int y;
	private int width;
	private int height;
	private Color color;
	protected int countRectangle1 = 2;
	private int countOval1;
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int width = getWidth(); //total width
		int height = getHeight(); //total height
		int coordinate1;
		int coordinate2;
		//int countRectangle = 0;
		
		for (int counter = 0; counter <=4; counter++ )
		{
			//generate numbers to use for x and width
			coordinate1 = randomNumbers.nextInt(width);
			coordinate2 = randomNumbers.nextInt(width);
			
			while (coordinate1 == coordinate2)
				coordinate2 = randomNumbers.nextInt(width);
			
			//identify x and width
			if (coordinate1 > coordinate2)
			{
				this.width = coordinate1;
				this.x = coordinate2;
			}
			else
			{
				this.width = coordinate2;
				this.x = coordinate1;
			}
			
			//generate numbers to use for y and height
			coordinate1 = randomNumbers.nextInt(height);
			coordinate2 = randomNumbers.nextInt(height);
			while (coordinate1 == coordinate2)
				coordinate2 = randomNumbers.nextInt(height);
			
			//identify y and height
			if (coordinate1 > coordinate2)
			{
				this.height = coordinate1;
				this.y = coordinate2;
			}
			else
			{
				this.height = coordinate2;
				this.y = coordinate1;
			}
			
			//generate random color for the shapes
			Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256),
					randomNumbers.nextInt(256));
			this.color = color;
			
			setBackground(Color.BLACK);
			
			//draw random shape
			int drawFlag = randomNumbers.nextInt(2);
			if (drawFlag==0)
			{
				MyRect myRectangle = new MyRect(this.x, this.y, this.width, this.height
						, this.color);
				myRectangle.draw(g);
				setCount(1);
				//countRectangle++;
			}
			else
			{
				MyOval myOval = new MyOval(this.x, this.y, this.width, this.height
						, this.color);
				myOval.draw(g);
			}
		
		}//end for loop
		
		
		
		//this.countRectangle1 = countRectangle;
		//setCount(countRectangle);
		System.out.print("\nfirst count Rectangle: " + countRectangle1); //first print
		
	
	}//end painComponent
	
	
	
	public void setCount(int count)
	{
		this.countRectangle1 = this.countRectangle1 + count;
	}
	
	
	public int getCount()
	{
		return this.countRectangle1;
	}
}//end class


