package org.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatedCharRemove {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "world";
		String temp = "" ;
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			for (int j = 0; j <= i ; j++) {
				char v = s2.charAt(j);
				if(c != v){
					temp = temp + v;
				}
			}
		}
		
		
		System.out.println(temp);
		
		/*int i = 10;
		int j = i & 1;
		if(j == 1){
			System.out.println("Odd");
		}else{
			System.out.println("Even");
		}*/
		
		
	/*	char[] cArr = s1.toCharArray();
		char[] vArr = s2.toCharArray();
		
		List list1 = Arrays.asList(cArr);
		List list2 = Arrays.asList(vArr);
		
		for (char ch : vArr) {
			if(!(list2.contains(ch))){
				list2.add(ch);
			}
		}
		
		System.out.println(list2);
		for (char i : cArr) {
			if(list2.contains(i)){
				list2.remove(i);
			}
		}
		
		System.out.println(list2.toString());*/
	}

}
