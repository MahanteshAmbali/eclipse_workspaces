package org.hib.collectionMapping.withAnnotation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hib.collectionMapping.withoutAnnotation.Student;
import org.hibernate.Session;

public class Manager2WithAnnotations {

	public static void main(String[] args) {

		Session session = Util.getSession();
		
		org.hib.collectionMapping.withAnnotation.Student student = new org.hib.collectionMapping.withAnnotation.Student();
		
		student.setId(101);
		student.setFirstName("Mahantesh");
		student.setMobileNumbers(new int[] {984499048, 903505098});
		
		String projects[] = {"CITI", "FLIPKART", "ICICI"};
		student.setProjects(projects);
		
		Collection<String> skills = new ArrayList<String>();
		skills.add("C");
		skills.add("C++");
		skills.add("Java");
		skills.add("Oracle DB");
		student.setSkills(skills);
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(new Integer(120));
		marks.add(new Integer(320));
		marks.add(new Integer(450));
		marks.add(new Integer(775));
		marks.add(new Integer(124));
		student.setMarks(marks);
		
		Set<String> jobs = new HashSet<String>();
		jobs.add("Software");
		jobs.add("Hardware");
		jobs.add("Middleware");
		student.setJobs(jobs);
		
		Map<String, String> educations = new HashMap<String, String>();
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
