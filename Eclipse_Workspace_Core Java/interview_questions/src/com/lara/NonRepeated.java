package com.lara;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeated 
{
	public static void main(String[] args)
	{
		String s1="hellllooo";
		char c[]=s1.toCharArray();
		char d=NonRepeated.firstNonRepeatingChar(c);
		System.out.println(d);
	}
		
		/*String s1="hello";
		char c=NonRepeated.getFirstNonRepeatingChar(s1);
		System.out.println(c);
	}
	public static Character getFirstNonRepeatingChar(String test) 
	{ 
		 
		char[] c=test.toCharArray(); 
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>(); 
		for(char ch : c)
		{ 
		if(map.containsKey(ch)) 
			map.put(ch, map.get(ch)-1); 
			else
			{ 
				map.put(ch,1); 
			} 
		} 
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{ 
			if(entry.getValue() == 1) 
				return entry.getKey(); 
		} 
		return null;*/
		

	    public static char firstNonRepeatingChar(char[] str)
		{
	       
	        byte[] b= new byte[112];
	        
	        for( char c : str )
	        {
	            b[c]++;
	            System.out.println(b[c]);
	        }
	        
	        for( char c : str )
	        {
	            if( b[c] == 1 )
	                return c;
	        }
	        
	        return 0;
	    }
	
		/*public static int count = 0;
		
		public static void main(String[] args) 
		{
			char c, v ;
			String finalString = null;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter: ");
			String str = sc.next();
			
			for (int i = 0; i < str.length()-1; i++) {
				c = str.charAt(i);
				for (int j = i+1; j < str.length()-1; j++) {
					v = str.charAt(j);
					
					if (c == v) {
						
						count++;
					}
					if(count == 1){
						finalString = replaceChars(str, c , v);
					}
					
					count = 0;
				}
			}
			System.out.println(finalString);
		}


		private static String replaceChars(String str, char c, char v) {
			
			if(str == null){
				return null;
			}
			
			str.replaceAll(Character.toString(v), "" );
			return str.replaceAll(Character.toString(c), "" );
		}*/
}
	