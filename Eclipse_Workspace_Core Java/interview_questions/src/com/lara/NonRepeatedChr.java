package com.lara;

public class NonRepeatedChr 
{
	public static void main(String[] args) 
	{
		String s1="hello";
		StringBuffer sb=new StringBuffer(s1);
		int i,j=0;
		for( i=0; i<s1.length(); i++)
		{
			for(j=0; j<s1.length(); j++)
			{
				if(i!=j && s1.charAt(i)==s1.charAt(j))
				{
					if(sb.indexOf(""+s1.charAt(i))!= -1)
					{
						sb.deleteCharAt(sb.indexOf(""+s1.charAt(i)));
					}
				}
			}
		}
		System.out.println(sb);
	}

}
