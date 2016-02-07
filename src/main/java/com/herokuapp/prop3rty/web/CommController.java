package com.herokuapp.prop3rty.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/comm")
public class CommController {
	
	@RequestMapping("")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("proprietati");
		return view;
	}

	@RequestMapping("/comm_sell")
	public ModelAndView sell() {
		ModelAndView view = new ModelAndView("comm_sell");
		return view;
	}

	@RequestMapping("/comm_rent")
	public ModelAndView rent() {
		ModelAndView view = new ModelAndView("comm_rent");
		return view;
	}
}
