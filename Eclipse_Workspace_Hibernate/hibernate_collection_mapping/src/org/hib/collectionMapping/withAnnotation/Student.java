package org.hib.collectionMapping.withAnnotation;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKey;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name = "Student_Coll_Annota")

public class Student {
	//===================================================================
	//===================================================================
	@Id
	private int id;
	
	//===================================================================	
	//===================================================================
	private String firstName;
	
	//===================================================================
	//===================================================================
	@ElementCollection
	@CollectionTable(name = "mobile_numbers_Anno",
					 joinColumns = @JoinColumn(name = "S_ID"))
	@IndexColumn(name = "SNO")
	@Column(name = "Mobile_Number")
	private int[] mobileNumbers;
	
	//===================================================================
	//===================================================================
	@ElementCollection
	@CollectionTable(name = "projects_Anno",
					 joinColumns = @JoinColumn(name = "S_ID"))
	@IndexColumn(name = "SNO")
	@Column(name = "Projects")
	private String[] projects;
	
	//===================================================================
	//===================================================================
	@ElementCollection
	@CollectionTable(name = "skills_Anno",
					 joinColumns = @JoinColumn(name = "S_ID"))
	@Column(name = "Skill_Name")
	private Collection<String> skills;
	
	//===================================================================
	//===================================================================
	@ElementCollection
	@CollectionTable(name = "marks_Anno",
					 joinColumns = @JoinColumn(name = "S_ID"))
	@IndexColumn(name = "SNO")
	@Column(name = "Marks")
	private List<Integer> marks;
	
	//===================================================================
	//===================================================================
	@ElementCollection
	@CollectionTable(name = "jobs_Anno",
					 joinColumns = @JoinColumn(name = "S_ID"))
	@Column(name = "Job_Name")
	private Set<String> jobs;
	
	//===================================================================
	//===================================================================
	@ElementCollection
	@CollectionTable(name = "Educations_Anno",
					 joinColumns = @JoinColumn(name = "S_ID"))
	@MapKeyColumn(name = "Education_Type")
	@Column(name = "Education_Name")
	private Map<String, String> education;

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

	public int[] getMobileNumbers() {
		return mobileNumbers;
	}

	public void setMobileNumbers(int[] mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	public String[] getProjects() {
		return projects;
	}

	public void setProjects(String[] projects) {
		this.projects = projects;
	}

	public Collection<String> getSkills() {
		return skills;
	}

	public void setSkills(Collection<String> skills) {
		this.skills = skills;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public Set<String> getJobs() {
		return jobs;
	}

	public void setJobs(Set<String> jobs) {
		this.jobs = jobs;
	}

	public Map<String, String> getEducation() {
		return education;
	}

	public void setEducation(Map<String, String> education) {
		this.education = education;
	}
}