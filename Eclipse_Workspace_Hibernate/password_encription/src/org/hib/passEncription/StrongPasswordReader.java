package org.hib.passEncription;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.jasypt.util.password.StrongPasswordEncryptor;

public class StrongPasswordReader {

	public static void main(String[] args) {

		String userName, passWord;
		boolean status = false;
		
		StrongPasswordEncryptor strongPasswordEncryptor = 
				new StrongPasswordEncryptor();
		
		Scanner scanner = new Scanner(System.in);
		Session session = Util.getSession();
		Person person = new Person();
		
		System.out.println("Enter username: ");
		userName = scanner.next();
		
		System.out.println("Enter password: ");
		passWord = scanner.next();
		
		Query query = session.createSQLQuery("select password from person_encripted where username =:arg0");
		query.setString("arg0", userName);
		
		List<String> list = query.list();
		for(String string : list){
			status = strongPasswordEncryptor.checkPassword(passWord, string);
		}
		
		
		if(status){
			System.out.println("Login Successful");
		}else{
			System.out.println("Loing Failed");
		}
	}

}
