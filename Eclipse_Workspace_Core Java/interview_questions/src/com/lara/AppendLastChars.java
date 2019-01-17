package com.lara;

public class AppendLastChars {

	static String s1 = "hello to world hello";
	static String s2 = "i am dell laptop";
	
	static String resString ;
	
	public static void main(String[] args) {
	
		int i ,j ;
		
		if(s1.length() > s2.length()){
			j = s2.length()-1;
			for (i = s1.length()-1 ; i >= 0 ; i--) {
				if(j >= 0){
					resString = resString + s1.charAt(i) + s2.charAt(j);
				}
				j--;
			}
		}

		if(s2.length() > s1.length()){
			i = s1.length()-1;
			for (j = s2.length()-1 ; j >= 0 ; j--) {
				if(i >= 0){
					resString = resString + s1.charAt(i) + s2.charAt(j);
				}
				i--;
			}
		}
		
		System.out.println(resString);
	}

}
