package com.herokuapp.prop3rty.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersController {

	@RequestMapping("/users")
	public ModelAndView login() {
		ModelAndView view = new ModelAndView("login");
		return view;
	}

}
