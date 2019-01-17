package org.logical.code;

import java.util.Scanner;

public class EvenOddTest 
{
	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		System.out.printf("Enter any number:");
		int number = console.nextInt();
		if((number%2)==0)
		{
			System.out.printf("number %d is even number %n",number);
		}
		else
		{
			System.out.printf("number %d is odd number %n",number);
		}
		
	}

}
