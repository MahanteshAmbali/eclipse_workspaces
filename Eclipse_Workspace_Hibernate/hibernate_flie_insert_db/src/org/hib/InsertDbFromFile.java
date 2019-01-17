package org.hib;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.hibernate.Session;

public class InsertDbFromFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader fin = new FileReader("test.txt");
		BufferedReader br = new BufferedReader(fin);
		
		
		Order o1 = new Order();
		
		String row = null;
		row = br.readLine();
		
		String[] cols;
		while (row != null) {
			
			Session s1 = Util.getSession();
			s1.beginTransaction();
			
			cols = row.split(",");
			
			o1.setOrderId(cols[0].trim());
			o1.setCustomerName(cols[1].trim());
			o1.setQuantity(cols[2].trim());
			o1.setPrice(cols[3].trim());
			
			s1.save(o1);
			s1.getTransaction().commit();
			s1.close();
			row = br.readLine();
		}

		br.close();
		fin.close();
		
		System.out.println("Done");
	}

}
