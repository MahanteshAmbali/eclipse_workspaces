package com.lara.app1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abchelloabc123abc";
		String s2 = "abc";
		
		Pattern p1 = Pattern.compile(s2);
		Matcher m1 = p1.matcher(s1);
		
		while (m1.find()) {
			System.out.println(m1.start());
		}
		
	}

}
