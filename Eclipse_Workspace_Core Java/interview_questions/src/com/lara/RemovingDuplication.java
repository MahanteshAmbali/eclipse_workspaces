package com.lara;

import java.util.Scanner;

public class RemovingDuplication 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String check = "y";
		String s1;
		do
		{
			System.out.println("Enter the String : ");
			s1 = sc.next();
			StringBuffer sb = new StringBuffer();
			
			for(int i=0;i<s1.length();i++)
			{
				if(sb.indexOf(""+s1.charAt(i)) == -1)
				{
					sb.append(s1.charAt(i));
				}
			}
			System.out.println("Entered Siring is "+s1);
			System.out.println("Required formate is "+sb);
			
			System.out.println();
			
			
			System.out.println("Do you want another(y/n) ");
			check = sc.next();
		}
		while("y".equalsIgnoreCase(check));
		System.out.println("Thank you.");
		
	}

}
