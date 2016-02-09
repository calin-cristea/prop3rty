package com.herokuapp.prop3rty.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public ModelAndView register() {
		ModelAndView view = new ModelAndView("register");
		view.addObject(new User());
		return view;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String createUser(User user) {
		userService.save(user);
		return "redirect:/users";
	}
}
