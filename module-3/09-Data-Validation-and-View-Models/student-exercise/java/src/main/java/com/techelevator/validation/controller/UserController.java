package com.techelevator.validation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.validation.model.Registration;
import com.techelevator.validation.model.User;
@Controller
@SessionAttributes("user")
public class UserController {
	// GET: /
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}

	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String showLogin(ModelMap map) {
		return "login";
	}
	
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String doLogin(User user, @RequestParam String password, ModelMap map) {
		if(!isValidLogin(user, password)) {
			map.addAttribute("error", "Invalid username or password");
			return "login";
		}
		map.addAttribute("user", user);
		return "loginConfirm";
	}
	
	@RequestMapping(path="/register")
	public String showSignUp(ModelMap map) {
		if(! map.containsAttribute("signup")) {
			map.addAttribute("signup", new Registration());
		}
		return "signup";
	}
	
	// Add the following Controller Actions

	// GET: /register
	// Return the empty registration view

	// POST: /register
	// Validate the model and redirect to confirmation (if successful) or return
	// the
	// registration view (if validation fails)

	// GET: /login
	// Return the empty login view

	// POST: /login
	// Validate the model and redirect to login (if successful) or return the
	// login view (if validation fails)

	// GET: /confirmation
	// Return the confirmation view

private boolean isValidLogin(User user, String password) {
	if (user.getEmail() == null || user.getPassword() ==null 
			|| !(user.getEmail().equals("John@te.com") && password.equals(("123")))) {
		return false;
	}
	
	user.setName("John Doe");
	return true;
}
}
