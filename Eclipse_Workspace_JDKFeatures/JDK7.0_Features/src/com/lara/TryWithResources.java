package com.lara;

import java.io.IOException;

class Resource implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource resource = new Resource();
		try{
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
