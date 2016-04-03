package com.arc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.arc.business.users.UpdateUserDetails;
import com.arc.dto.academic.SSCDetails;

@Controller
@RequestMapping(value="/profile")
public class ProfileUpdateController {
	@RequestMapping(value="updateSSCDetails", method=RequestMethod.POST)
	public ModelAndView updateSSCDetails(@ModelAttribute("SSCDetails") SSCDetails sscDetails) {
		ModelAndView modelAndView = new ModelAndView("redirect:/profile/academic/SSCDetails");
		UpdateUserDetails.updateSSCdetails(sscDetails);
		return modelAndView;
	}
}
