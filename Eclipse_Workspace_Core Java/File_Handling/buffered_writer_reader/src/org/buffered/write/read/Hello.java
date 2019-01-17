package org.buffered.write.read;

public class Hello {

	public static void main(String[] args) {

		String s1 = "hello", temp = "";
		int count = 0;
		for (int i = 0; i < s1.length()-1; i++) {
			char c = s1.charAt(i);
			for (int j = i+1; j < s1.length()-1; j++) {
				char v = s1.charAt(j);
				if(c == v){
					count++;
				}
			}
		}
		
		System.out.println(temp);
	}

}
