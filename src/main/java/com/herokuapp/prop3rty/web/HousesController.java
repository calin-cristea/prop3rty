package com.herokuapp.prop3rty.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/houses")
public class HousesController {

	@RequestMapping("")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("case");
		return view;
	}

	@RequestMapping("/house_sell")
	public ModelAndView sell() {
		ModelAndView view = new ModelAndView("house_sell");
		return view;
	}

	@RequestMapping("/house_rent")
	public ModelAndView rent() {
		ModelAndView view = new ModelAndView("house_rent");
		return view;
	}
}
