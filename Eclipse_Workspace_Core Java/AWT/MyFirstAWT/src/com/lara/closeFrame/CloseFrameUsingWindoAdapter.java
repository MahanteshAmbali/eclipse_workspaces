package com.lara.closeFrame;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CloseFrameUsingWindoAdapter extends Frame{

	public CloseFrameUsingWindoAdapter(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloseFrameUsingWindoAdapter obj = new CloseFrameUsingWindoAdapter("My First Frame Closable");
		obj.setSize(400, 500);
		
		obj.setVisible(true);
		
		obj.addWindowListener(new MyClass());
	}
}

class MyClass extends WindowAdapter{
	
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	
}
