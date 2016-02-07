package com.herokuapp.prop3rty.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/legal")
public class LegalController {
	
	@RequestMapping("")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("legal");
		return view;
	}
	
}
