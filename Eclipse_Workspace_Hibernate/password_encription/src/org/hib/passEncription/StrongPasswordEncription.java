package org.hib.passEncription;

import java.util.Scanner;

import org.hibernate.Session;
import org.jasypt.util.password.StrongPasswordEncryptor;

public class StrongPasswordEncription {

	public static void main(String[] args) {

		String userName, passWord;
		Scanner scanner = new Scanner(System.in);
		Session session = Util.getSession();
		session.beginTransaction();
		
		Person person = new Person();
		System.out.println("Enter username: ");
		userName = scanner.next();
		
		System.out.println("Enter password: ");
		passWord = scanner.next();
		
		StrongPasswordEncryptor strongPasswordEncryptor = 
				new StrongPasswordEncryptor();
		
		String encriptedPassword = strongPasswordEncryptor.encryptPassword(passWord);
		person.setId(1);
		person.setUsername(userName);
		person.setPassword(encriptedPassword);
		
		session.save(person);
		session.getTransaction().commit();
		
		System.out.println("Done");
	}

}
