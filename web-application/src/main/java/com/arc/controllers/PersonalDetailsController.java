package com.arc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.arc.dao.DB;
import com.arc.dto.PersonalDetails;

@Controller
public class PersonalDetailsController {
	@RequestMapping(value="/PersonalDetailsController")
	public ModelAndView setPersonalDetails(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView("profile/personalDetails.jsp");
		System.out.println("In Personal");
		String rollNumber = (String) session.getAttribute("rollNumber");
		PersonalDetails personalDetails = (PersonalDetails) DB.get(PersonalDetails.class, rollNumber);
		modelAndView.addObject("personalDetails", personalDetails);
		
		return modelAndView;
	}
}