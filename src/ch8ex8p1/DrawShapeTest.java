package ch8ex8p1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class DrawShapeTest extends JFrame 
{
	public static void main(String[] args)
	{
		DrawShape shape = new DrawShape();
		JFrame app = new JFrame();
		app.setSize(400, 400);
		
		//JLabel rectangleLabel = new JLabel();
		//rectangleLabel.setText("aaaarrrrrgghhhh!!!!!" + shape.getCount());
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//shape.setSize(300, 300);
		
		app.setLayout(new BorderLayout());
		app.add(shape);
		//app.add(rectangleLabel, BorderLayout.SOUTH);
		app.setVisible(true);
		System.out.println("\nsecond print Rectangle: " + shape.getCount());
	}
}
