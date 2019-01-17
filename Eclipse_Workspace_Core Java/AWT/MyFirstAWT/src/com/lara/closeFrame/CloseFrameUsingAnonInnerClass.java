package com.lara.closeFrame;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CloseFrameUsingAnonInnerClass extends Frame{

	public CloseFrameUsingAnonInnerClass(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloseFrameUsingAnonInnerClass obj = new CloseFrameUsingAnonInnerClass("Closable Frame");
		
		obj.setVisible(true);
		
		obj.setSize(300, 400);
		
		obj.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}

}
