package org.logical.code;

public class frq 
{
	public static void main(String[] args) 
	{
		int count = 0;
		String s = "nagaveni";
		//String temp = "a";
		char[] c = s.toCharArray();
		int l = c.length;
		for(int i =0;i<l;i++)
		{
			//temp = s.charAt(i);
			if( c[i] == 'a')
			{
				count++;
			}
			
		}
		System.out.println(+count);
		
	}

}
