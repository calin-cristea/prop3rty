package com.cristeanet.prop3rty.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/docs")
public class DocsController {
	
	@RequestMapping("")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("documentatie");
		return view;
	}
	
}
