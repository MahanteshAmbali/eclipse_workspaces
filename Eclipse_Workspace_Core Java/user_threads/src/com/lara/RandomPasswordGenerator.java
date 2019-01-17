package com.lara;

import java.util.Random;

public class RandomPasswordGenerator {

	private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final int passwordLength = 10;
	
	private String generatePassword(){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < passwordLength; i++) {
			Random random = new Random();
			int randomAccess = random.nextInt((CHAR_LIST.length()));
			sb.append(CHAR_LIST.charAt(randomAccess));
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {

		RandomPasswordGenerator randomPassword = new RandomPasswordGenerator();
		System.out.println("Random Password: "+randomPassword.generatePassword());
		System.out.println("Random Password: "+randomPassword.generatePassword());
		System.out.println("Random Password: "+randomPassword.generatePassword());
		System.out.println("Random Password: "+randomPassword.generatePassword());
	}
}