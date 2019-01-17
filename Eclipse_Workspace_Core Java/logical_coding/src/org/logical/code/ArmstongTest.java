package org.logical.code;

import java.util.Scanner;

public class ArmstongTest 
{
	public static void main(String[] args) 
	{
		System.out.println("please enter a 3 digit number to find if its an Armstong");
		int number = new Scanner(System.in).nextInt();
		if(isArmStrong(number))
		{
			System.out.println("Number:"+number+"is not an Armstrong number");
		}
		
	}
	private static boolean isArmStrong(int number)
	{
		int result = 0;
		int orig = number;
		while(number!=0)
		{
			int remainder = number%10;
			result = result+remainder*remainder*remainder;
			number = number/10;
		}
		if(orig == result)
		{
			return true;
		}
		  return false;
	}

}
