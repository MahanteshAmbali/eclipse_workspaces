package org.first;

import java.util.Scanner;

public class Reverse_Number {

	public static final int A = 5;
	public static final int B;
	
	static{
		if(A == 5){
			B = 10;
		}else{
			B = 5;
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input number: ");
		
		int inputNum = sc.nextInt();
		int rem, rev =0 ;
		
		while (inputNum != 0) 
		{
			rem = inputNum % 10;
			rev = rev*10 + rem;
			inputNum = inputNum / 10;
		}
		
		System.out.println("Reverse num is: "+rev);
	}

}
