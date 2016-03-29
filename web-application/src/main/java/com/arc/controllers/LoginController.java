package com.arc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.arc.business.login.UserLogin;
import com.arc.util.hash.Hashes;

@Controller
public class LoginController {
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login(@RequestParam("rollNumber") String rollNumber, @RequestParam("password") String password, HttpSession session) {		
		ModelAndView model = null;
		rollNumber = rollNumber.trim();
		password = password.trim();
		String passwordHash = Hashes.getSHA1(password.getBytes());
		
		boolean success = UserLogin.login(rollNumber, passwordHash);
		if(success) {
			 model = new ModelAndView("/PersonalDetailsController");
			 session.setAttribute("rollNumber", rollNumber);
		}
		else {
			model = new ModelAndView("/home.jsp");
		}
		return model;
	}

}
