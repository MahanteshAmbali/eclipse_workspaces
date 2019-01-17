package com.lara.drawShapesInFrame;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Draw1 extends Frame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Draw1(String string){
		super(string);
	}
	
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.blue);
		g.drawRect(40, 40, 200, 200);
		
		g.setColor(Color.RED);
		g.drawOval(90, 70, 80, 80);
		
		g.drawOval(110, 95, 5, 5);
		g.drawOval(145, 95, 5, 5);
		
		g.drawLine(130, 95, 130, 115);
		
		g.drawArc(113, 115, 35, 20, 0, -180);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw1 draw1 = new Draw1("Image Inside Frame");
		draw1.setSize(270, 270);
		
		draw1.setVisible(true);
		
		draw1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}

}
