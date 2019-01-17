package com.lara.openFrame;

import java.awt.Frame;

public class MyFrame extends Frame{

	public MyFrame() {
		// TODO Auto-generated constructor stub
	}
	
	public MyFrame(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Frame frame = new Frame("My First Frame");
		frame.setSize(200, 400);
		frame.setVisible(true);*/
		
		MyFrame myFrame = new MyFrame("My First Frame");
		myFrame.setSize(400, 500);
		myFrame.setVisible(true);
		
	}

}
