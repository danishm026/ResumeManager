package com.arc.dto.academic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class GraduationDetails {
	@Id
	private String rollNumber;
	@NotNull
	private String branch;
	@NotNull
	private String year;
	@ElementCollection(fetch=FetchType.EAGER)
	@Size(min=2)
	@JoinTable(name="Graduation_Marks")
	private List<Integer> marks = new ArrayList<Integer>();
	
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	
}
