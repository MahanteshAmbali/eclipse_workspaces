package org.hibernate.many_to_many;

import java.util.HashSet;
import java.util.Set;

public class Batches {

	private int bId;
	private String courseName;
	private String duration;
	
	private Set students = new HashSet();

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Set getStudents() {
		return students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}
	
	public void addStudent(Student student){
		students.add(student);
		student.getBatches().add(this);
	}
}
