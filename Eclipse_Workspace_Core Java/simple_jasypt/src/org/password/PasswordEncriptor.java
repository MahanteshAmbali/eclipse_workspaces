package org.password;

import java.util.Scanner;

import org.jasypt.util.password.StrongPasswordEncryptor;

public class PasswordEncriptor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your password: ");
		String password = scanner.next();
		
		StrongPasswordEncryptor strongPasswordEncryptor = 
				new StrongPasswordEncryptor();
		
		String encryptedPassword = strongPasswordEncryptor.encryptPassword(password);
		
		System.out.println("Enter your account password: ");
		String inputPassword = scanner.next();
		
		if(strongPasswordEncryptor.checkPassword(inputPassword, encryptedPassword)){
			System.out.println("Success");
		}else{
			System.out.println("Check your password. !");
		}
	}

}
