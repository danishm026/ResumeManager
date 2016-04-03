package com.arc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.arc.business.registration.UserRegistration;
import com.arc.dto.UserRegistrationDetails;
import com.arc.util.propertyeditors.PasswordEditor;

@Controller
public class RegistrationController {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String [] {"confirmedPassword"});
		binder.registerCustomEditor(String.class, "passwordHash", new PasswordEditor());
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView register(@ModelAttribute UserRegistrationDetails userRegistrationDetails) {
		ModelAndView modelAndView  = null;
		boolean success = UserRegistration.registerUser(userRegistrationDetails);
		if(success) {
			modelAndView = new ModelAndView("registration/registrationSuccess.jsp");
		}
		else {
			modelAndView = new ModelAndView("registration/registrationFailure.jsp");
		}
		return modelAndView;
	}
}
