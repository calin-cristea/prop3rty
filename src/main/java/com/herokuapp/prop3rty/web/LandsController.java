package com.herokuapp.prop3rty.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/lands")
public class LandsController {
	@RequestMapping("")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("terenuri");
		return view;
	}

	@RequestMapping("/land_sell")
	public ModelAndView sell() {
		ModelAndView view = new ModelAndView("land_sell");
		return view;
	}

}
