package com.herokuapp.prop3rty.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/apartments")
public class ApartmentsController {

	@RequestMapping("")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("apartamente");
		return view;
	}

	@RequestMapping("/apt_sell")
	public String sell() {
		//ModelAndView view = new ModelAndView("apt_sell");
		return "apt_sell";
	}

	@RequestMapping("/apt_rent")
	public ModelAndView rent() {
		ModelAndView view = new ModelAndView("apt_rent");
		return view;
	}
}
