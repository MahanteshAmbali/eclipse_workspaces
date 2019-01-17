package org.logical.code;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber 
{
	public static void main(String[] args)  
	{
		int c;
		Random t = new Random();
		Scanner sc = new Scanner(System.in);
		//int t = sc.nextInt(100);
		for(c=1;c<=10;c++)
		{
			System.out.println(t.nextInt(100));
		}
		
		
	}

}
