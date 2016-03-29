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
public class HSCDetails {
	@Id
	private String rollNumber;
	@NotNull
	private String schoolName;
	@NotNull
	private String board;
	@NotNull
	private String year;
	@NotNull
	private String aggregate;
	@ElementCollection(fetch=FetchType.EAGER)
	@Size(min=3)
	@JoinTable(name="HSC_Subjects")
	private List<String> subjects = new ArrayList<String>();
	
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getAggregate() {
		return aggregate;
	}
	public void setAggregate(String aggregate) {
		this.aggregate = aggregate;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
}
