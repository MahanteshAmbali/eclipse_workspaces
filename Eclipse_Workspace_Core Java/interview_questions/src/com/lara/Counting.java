package com.lara;

import java.util.Scanner;

public class Counting 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1=sc.next();
		sc.close();
		StringBuffer sb=new StringBuffer(s1);
		while(sb.length()!=0)
		{
			char c=sb.charAt(0);
			System.out.println(c);
			int count=0;		
			//System.out.println(count);
		for(int i=0;i<sb.length(); i++)
		{
			System.out.println(sb.charAt(i));
			if(c==sb.charAt(i))
			{
				count++;
				sb.deleteCharAt(i);
				System.out.println(sb);
				i--;
			}
		}	
		System.out.println(c +" is Occurening : "+count+" times");
	}
 }
}
