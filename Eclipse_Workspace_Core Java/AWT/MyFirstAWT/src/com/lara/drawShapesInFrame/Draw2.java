package com.lara.drawShapesInFrame;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Draw2 extends Frame{

	public Draw2() {
		// TODO Auto-generated constructor stub
		super();
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.fillRect(100, 100, 200, 200);
		
		g.setColor(Color.red);
		g.fillOval(150, 150, 100, 100);
		
		g.setColor(Color.black);
		g.fillOval(175, 180, 10, 10);
		g.fillOval(220, 180, 10, 10);
		
		g.drawLine(200, 180, 200, 210);
		
		g.setColor(Color.white);
		g.fillArc(175, 180, 10, 10, 0, -180);
		g.fillArc(220, 180, 10, 10, 0, -180);
		
		g.setColor(Color.black);
		g.fillArc(175, 210, 50, 20, 0, -180);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw2 draw2 = new Draw2();
		
		draw2.setSize(400, 400);
		draw2.setTitle("Frame With Coloured Smiley Face");
		
		draw2.setVisible(true);
	}

}
