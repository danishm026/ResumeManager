package com.arc.controllers;

import org.joda.time.LocalDate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.arc.business.users.UpdateUserDetails;
import com.arc.dto.PersonalDetails;
import com.arc.util.propertyeditors.CustomJodaDateEditor;

@Controller
public class UpdatePersonalDetailsController {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(LocalDate.class, "dob", new CustomJodaDateEditor());;
	}
	
	@RequestMapping(value="/UpdatePersonalDetails", method=RequestMethod.POST)
	public ModelAndView updatePersonalDetails(@ModelAttribute PersonalDetails personalDetails) {
		ModelAndView modelAndView = new ModelAndView("redirect:PersonalDetailsController");
		System.out.println("In Update");
		UpdateUserDetails.updatePersonalDetails(personalDetails);
		return modelAndView;
	}	
}
