package com.lara;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
	      String strReverse;
	      StringBuilder sb = new StringBuilder();
	      StringTokenizer st = new StringTokenizer(str);
	      System.out.println(st);
	      
	      while (st.hasMoreTokens()) {
	         sb.insert(0, st.nextToken());
	         if (st.hasMoreTokens()) {
	            sb.insert(0, " ");
	         }
	      }
	      strReverse = sb.toString();
	      System.out.println(strReverse);
	}

}
