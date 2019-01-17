package com.lara.drawShapesInFrame;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Home extends Frame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Home() {
		// TODO Auto-generated constructor stub
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		int[] xPoints = {375, 275, 475};
		int[] yPoints = {125, 200, 200};
		
		int nPoints = 3;
		
		this.setBackground(Color.gray);
		
		g.setColor(Color.yellow);
		g.fillRect(300, 200, 150, 100);
		
		g.setColor(Color.blue);
		g.fillRect(350, 210, 50, 60);
		
		g.drawLine(350, 280, 400, 280);
		
		g.setColor(Color.darkGray);
		g.fillPolygon(xPoints, yPoints, nPoints);
		
		g.setColor(Color.white);
		g.fillOval(100, 100, 60, 60);
		
		g.setColor(Color.green);
		g.fillArc(50, 250, 150, 100, 0, 180);
		g.fillArc(150, 250, 150, 100, 0, 180);
		g.fillArc(450, 250, 150, 100, 0, 180);
		
		g.drawLine(50, 300, 600, 300);
		
		g.drawString("My Happy Home", 275, 350);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home home = new Home();
		
		home.setTitle("My Home");
		
		home.setSize(500, 400);
		
		home.setVisible(true);
	}

}
