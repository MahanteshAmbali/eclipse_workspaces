package com.lara.drawShapesInFrame;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawPolygon extends Frame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DrawPolygon() {
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
		g.setColor(Color.red);
		
		int[] xPoints = {200, 250, 160, 270};
		int[] yPoints = {200, 240, 350, 210};
		int nPoints = 4;
		g.fillPolygon(xPoints, yPoints, nPoints);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawPolygon obj = new DrawPolygon();
		obj.setTitle("Polygon");
		
		obj.setSize(400, 400);
		
		obj.setVisible(true);
	}

}
