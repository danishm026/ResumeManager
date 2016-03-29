package com.arc.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arc.business.registration.UserRegistration;
import com.arc.dto.UserRegistrationDetails;
import com.arc.util.hash.Hashes;

public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rollNumber = request.getParameter("rollNumber").trim().toUpperCase();
		String email = request.getParameter("email").trim();
		String passwordHash = Hashes.getSHA1(request.getParameter("password").trim().getBytes());
		
		UserRegistrationDetails user = new UserRegistrationDetails(rollNumber, email, passwordHash);
		
		boolean success = UserRegistration.registerUser(user);
		if(success) {
			response.sendRedirect("registration/registrationSuccess.jsp");
		}
		else {
			response.sendRedirect("registration/registrationFailure.jsp");
		}
	}
}
