package com.lara.drawShapesInFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Message extends Frame{

	public Message() {
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
		this.setBackground(Color.gray);
		
		Font f = new Font("Times New Roman", Font.BOLD+Font.ITALIC, 30);
		g.setFont(f);
		
		g.setColor(Color.green);
		
		g.drawString("Hello. How are you..?", 100, 100);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message frame = new Message();
		frame.setTitle("Frame With String");
		
		frame.setSize(500, 400);
		
		frame.setVisible(true);
	}

}
