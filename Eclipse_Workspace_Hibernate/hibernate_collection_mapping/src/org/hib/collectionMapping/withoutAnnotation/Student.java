package org.hib.collectionMapping.withoutAnnotation;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Student {

	private int id;
	private String firstName;
	private String[] projects;
	private Collection skills;
	private List marks;
	private Set jobs;
	private Map education;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String[] getProjects() {
		return projects;
	}
	public void setProjects(String[] projects) {
		this.projects = projects;
	}
	public Collection getSkills() {
		return skills;
	}
	public void setSkills(Collection skills) {
		this.skills = skills;
	}
	public List getMarks() {
		return marks;
	}
	public void setMarks(List marks) {
		this.marks = marks;
	}
	public Set getJobs() {
		return jobs;
	}
	public void setJobs(Set jobs) {
		this.jobs = jobs;
	}
	public Map getEducation() {
		return education;
	}
	public void setEducation(Map education) {
		this.education = education;
	}
}
