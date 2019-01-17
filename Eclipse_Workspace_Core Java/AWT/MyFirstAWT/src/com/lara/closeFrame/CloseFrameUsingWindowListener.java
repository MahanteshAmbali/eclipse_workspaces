package com.lara.closeFrame;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CloseFrameUsingWindowListener extends Frame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CloseFrameUsingWindowListener(String string) {
		super(string);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloseFrameUsingWindowListener obj = new CloseFrameUsingWindowListener("My First Frame");
		obj.setSize(400, 500);
		
		obj.setVisible(true);
		
		obj.addWindowListener(new CloseFrame());
	}	
}

class CloseFrame implements WindowListener{

	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
