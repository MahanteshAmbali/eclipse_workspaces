package com.lara.app2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplicates {

	//MY APPROACH
	public static void main(String[] args) {
		
		String s1 = "abcaa";
		
		String final_res = " ";
		
		char c1, c2;
		
		for (int i = 0; i < s1.length(); i++) {
			
			for (int j = 0; j < s1.length(); j++) {
				
					c1 = s1.charAt(i);
					c2 = s1.charAt(j);
					
					if(c1 != c2){
						final_res = final_res + c1;
					}
			}
		}
		
		final_res = final_res.trim();
		System.out.println("Final String Without Duplicates is: "+final_res);
	}
	
	// FROM INTERNET
	
	/*public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any word: ");
		String s=br.readLine();
		s = s + " "; // Adding a space at the and of the word
		int l=s.length();
		String ans = ""; //variable to store the final result
		char ch1,ch2;
		
		for(int i=0;i<l-1;i++)
		{
			ch1 = s.charAt(i); //extracting the first character
			ch2 = s.charAt(i+1);//extracting the next character
		
			// Adding the first extracted character to the result if the current and the next 
			//characters are different
			if(ch1 != ch2)
			{
				ans = ans + ch1;
			}
		
	   }
		System.out.println("word after removing repeated characters=" +ans); //printing the result
	}*/
}
