package com.herokuapp.prop3rty.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.herokuapp.prop3rty.domain.User;
import com.herokuapp.prop3rty.service.UserService;

@Controller
public class RegisterController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/register")
	public String register(User user, Model model) {
		model.addAttribute("user", user);
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String createUser(User user, Model model) {
		userService.save(user);
		if (user.getErrorMessage() != null) {
			model.addAttribute("user", user);
			return "register";
		}
		return "redirect:/users";
	}
}
