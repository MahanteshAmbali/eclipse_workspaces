package org.hib.criteria;

import java.io.BufferedReader;
import java.io.FileReader;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session hibernSession = Util.getSession();
		hibernSession.beginTransaction();
		FileReader fin = null;
		BufferedReader bin = null;
		Person p1 = null;
		
		String line;
		String[] data = null;
				
		try {
			fin = new FileReader("Person.txt");
			bin = new BufferedReader(fin);
			line = bin.readLine();
			while(line != null){
				data = line.split(",");
				p1 = new Person();
				p1.setPersonId(Integer.parseInt(data[0].trim()));
				p1.setPersonFirstName(data[1].trim());
				p1.setPersonAddress(data[2].trim());
				p1.setPersonEducation(data[3].trim());
				p1.setPersonAge(Integer.parseInt(data[4].trim()));
				p1.setPersonSalary(Integer.parseInt(data[5].trim()));
				
				hibernSession.save(p1);
				
				line = bin.readLine();
			}	
			hibernSession.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(fin != null){
					fin.close();
					fin = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		
			
			try {
					if(bin != null){
						bin.close();
						bin = null;
					}
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
		}		
		
		hibernSession.flush();
		hibernSession.close();
		
		System.out.println("Done");
	}

}
