package com.cristeanet.prop3rty.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/about")
public class AboutController {
	
	@RequestMapping("")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("despre");
		return view;
	}
}
