package com.arc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.arc.dao.DB;
import com.arc.dto.academic.SSCDetails;

@Controller
@RequestMapping("/profile")
public class ViewProfileController {
	@RequestMapping(value="academic/SSCDetails")
	public ModelAndView viewSSCDetails(HttpSession session) {
		ModelAndView model = new ModelAndView("SSCDetails.jsp");
		String rollNumber = (String) session.getAttribute("rollNumber");
		SSCDetails sscDetails = (SSCDetails) DB.get(SSCDetails.class, rollNumber);
		model.addObject("rollNumber", rollNumber);
		model.addObject("SSCDetails", sscDetails);
		return model;
	}
}
