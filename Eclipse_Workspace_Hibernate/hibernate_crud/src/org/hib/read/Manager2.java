package org.hib.read;

import org.hib.util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager2 {

	public static void main(String[] args) {
	/*	Book book1 = new Book();
		book1.setBid("1");
		book1.setAuthorName("Micheal");
		book1.setBookName("J2EE");
		
		Book book2 = new Book();
		book2.setBid("2");
		book2.setAuthorName("Gravin");
		book2.setBookName("Hibernate");
		
		Session s1 = Util.getSession();
		Transaction tx = s1.beginTransaction();
		s1.save(book1);
		s1.save(book2);
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		*/
		
		Session s2 = Util.getSession();
		Book advJava = (Book) s2.load(Book.class, "1");
		System.out.print("Id: "+advJava.getBid());
		System.out.print(", Book Name: "+advJava.getBookName());
		System.out.println(", Author Name: "+advJava.getAuthorName());
		
		Book hiberNate = (Book) s2.load(Book.class, "2");
		System.out.print("Id: "+hiberNate.getBid());
		System.out.print(", Book Name: "+hiberNate.getBookName());
		System.out.println(", Author Name: "+hiberNate.getAuthorName());
		
		s2.close();
		
		
	}
}
