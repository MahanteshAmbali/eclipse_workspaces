package org.java;

public class NumberofMatcherOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String srcString = "aabbccdsfkksadfkkaeffeeffkssfff";
		String matcherString = "kk";
		
		String temp = "";
		int srcLength = srcString.length()-1;
		int length = 0, count = 0;
		
		
		while(length <= srcLength){
			for (int i = 0; i <= matcherString.length()-1; i++) {
				temp = temp + srcString.charAt(length++);
				if(temp.equals(matcherString)){
					count++;
				}
			}
			temp = "";
		}
		
		System.out.println(matcherString+" string occurs: "+count+" times");
	}

}
