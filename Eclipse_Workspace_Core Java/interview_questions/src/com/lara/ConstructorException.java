/*Constructor can throw any type of exception
 * but the object must be created in the 
 * try block.
 */

package com.lara;

import java.io.IOException;

public class ConstructorException {

	public ConstructorException() throws IOException {
	
	}
	
	public static void main(String[] args) {

		
		try {
			ConstructorException obj1 = new ConstructorException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
