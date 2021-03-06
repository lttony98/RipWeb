package com.controller;

import com.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class SignupController {

	@Autowired
	UserDAO userDAO;

	@GetMapping("/signup")
	public String getSignup() { return "signup"; }

	@PostMapping("/signup")
	public String signup(@RequestParam String email,
	                     @RequestParam String nickname,
	                     @RequestParam String password,
                         @RequestParam String repassword,
                         ModelMap model) {
		// ADD USER TO DB HERE
		model.addAttribute("registerNewUser", userDAO.registerNewUser(nickname, email, password));
		model.addAttribute("message", "Sign up successfully!");
		return "login";
	}
}

