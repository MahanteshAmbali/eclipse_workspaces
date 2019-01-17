package org.calci;

import java.util.Scanner;

import junit.framework.TestCase;

public class SimpleCalcJUnit extends TestCase{

	
	//Scanner scanner = new Scanner(System.in);
	int num1, num2, actualResult, expectedResult;
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		num1 = 80;
		num2 = 30;
	}
	
	protected void testSimpleCalcAdd(){
		
		expectedResult = num1 - num2;
		
		actualResult = SimpleCalc.sub(num1, num2);
		
		assertEquals(actualResult, expectedResult);
		
	}	
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		num1 = 0;
		num2 = 0;
	}
	
}
