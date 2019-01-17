package org.hib.collectionMapping.withoutAnnotation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = Util.getSession();
		
		Student student = new Student();
		
		student.setFirstName("Mahantesh");
		
		String projects[] = {"CITI", "FLIPKART", "ICICI"};
		student.setProjects(projects);
		
		Collection skills = new ArrayList();
		skills.add("C");
		skills.add("C++");
		skills.add("Java");
		skills.add("Oracle DB");
		student.setSkills(skills);
		
		List marks = new ArrayList();
		marks.add(new Integer(120));
		marks.add(new Integer(320));
		marks.add(new Integer(450));
		marks.add(new Integer(775));
		marks.add(new Integer(124));
		student.setMarks(marks);
		
		Set jobs = new HashSet();
		jobs.add("Software");
		jobs.add("Hardware");
		jobs.add("Middleware");
		student.setJobs(jobs);
		
		Map educations = new HashMap();
		educations.put("graduation", "BE");
		educations.put("post_graduation", "MTech");
		educations.put("p_hd", "Embedded_Systems");
		student.setEducation(educations);
		
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		
		session.flush();
		session.close();
		
		System.out.println("Successfully Inserted..!");
	}

}
