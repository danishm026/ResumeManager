package com.arc.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;

@Entity
public class PersonalDetails {
	@Id
	private String rollNumber;
	@NotNull
	private String firstName;
	private String middleName;
	private String lastName;
	@NotNull
	private String guardianName;
	@Size(min=1)
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="User_JobInterest")
	private List<String> jobInterest = new ArrayList<String>();
	@NotNull
	private String permanentAddress;
	@NotNull
	private String currentAddress;
	@NotNull
	@Column(length=10)
	private String studentMobileNumber;
	@NotNull
	@Column(length=10)
	private String guardianMobileNumber;
	@NotNull
	private String email;
	@NotNull
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate dob;
	@NotNull
	private String placeOfBirth;
	@NotNull
	private String sex;
	@NotNull
	private String category;
	@NotNull
	private String maritalStatus;
	@NotNull
	private String citizenship;
	
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public List<String> getJobInterest() {
		return jobInterest;
	}
	public void setJobInterest(List<String> jobInterest) {
		this.jobInterest = jobInterest;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	public String getStudentMobileNumber() {
		return studentMobileNumber;
	}
	public void setStudentMobileNumber(String studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}
	public String getGuardianMobileNumber() {
		return guardianMobileNumber;
	}
	public void setGuardianMobileNumber(String guardianMobileNumber) {
		this.guardianMobileNumber = guardianMobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
}
