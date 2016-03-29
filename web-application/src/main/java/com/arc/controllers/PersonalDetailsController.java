package com.arc.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.arc.dao.DB;
import com.arc.dto.PersonalDetails;

public class PersonalDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String rollNumber = (String) session.getAttribute("rollNumber");
		
		PersonalDetails personalDetails = null;
		personalDetails = (PersonalDetails) DB.get(PersonalDetails.class, rollNumber);
		session.setAttribute("personalDetails", personalDetails);
		
		String root = getServletContext().getContextPath();
		response.sendRedirect(root + "/profile/personalDetails.jsp");
	}
}
