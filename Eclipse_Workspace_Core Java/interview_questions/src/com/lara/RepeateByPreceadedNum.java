package com.lara;

public class RepeateByPreceadedNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "a2b3c7";
	    for (int i = 0; i < s1.length(); i++) {
			int ascii = (int) s1.charAt(i);
	    	if((ascii >= 48) && (ascii <=57 )){
				for (int j = ascii-48; j > 0; j--) {
					System.out.println(s1.charAt(i-1));
				}
			}
		}
	}

}
