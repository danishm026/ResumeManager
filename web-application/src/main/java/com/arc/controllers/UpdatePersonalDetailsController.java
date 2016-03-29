package com.arc.controllers;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.LocalDate;

import com.arc.business.users.UpdateUserDetails;
import com.arc.dto.PersonalDetails;
import com.arc.util.string.StringUtil;

@WebServlet("/profile/UpdatePersonalDetails")
public class UpdatePersonalDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rollNumber = request.getParameter("rollNumber").trim();
		String firstName = (String)request.getParameter("firstName").trim();
		String middleName = request.getParameter("middleName").trim();
		String lastName = request.getParameter("lastName").trim();
		String guardianName = request.getParameter("guardianName").trim();
		String jobInterest[] = request.getParameterValues("jobInterest");
		String permanentAddress = request.getParameter("permanentAddress").trim();
		String currentAddress = request.getParameter("currentAddress").trim();
		String studentMobileNumber = request.getParameter("studentMobileNumber").trim();
		String guardianMobileNumber = request.getParameter("guardianMobileNumber").trim();
		String email = request.getParameter("email").trim();
		String dob = request.getParameter("dob");
		String placeOfBirth = request.getParameter("placeOfBirth").trim();
		String sex = request.getParameter("sex").trim();
		String category = request.getParameter("category").trim();
		String maritalStatus = request.getParameter("maritalStatus").trim();
		String citizenship = request.getParameter("citizenship");
		
		LocalDate jodaDob = StringUtil.getLocalDateFromString(dob, "yyyy-MM-dd");
		List<String> jobInterestList = Arrays.asList(jobInterest);
		
		PersonalDetails personalDetails = new PersonalDetails();
		personalDetails.setRollNumber(rollNumber);
		personalDetails.setFirstName(firstName);
		personalDetails.setMiddleName(middleName);
		personalDetails.setLastName(lastName);
		personalDetails.setGuardianName(guardianName);
		personalDetails.setJobInterest(jobInterestList);
		personalDetails.setPermanentAddress(permanentAddress);
		personalDetails.setCurrentAddress(currentAddress);
		personalDetails.setStudentMobileNumber(studentMobileNumber);
		personalDetails.setGuardianMobileNumber(guardianMobileNumber);
		personalDetails.setEmail(email);
		personalDetails.setDob(jodaDob);
		personalDetails.setPlaceOfBirth(placeOfBirth);
		personalDetails.setSex(sex);
		personalDetails.setCategory(category);
		personalDetails.setMaritalStatus(maritalStatus);
		personalDetails.setCitizenship(citizenship);
		UpdateUserDetails.updatePersonalDetails(personalDetails);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/PersonalDetailsController");
		dispatcher.forward(request, response);
	}
}
