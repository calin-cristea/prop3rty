package com.herokuapp.prop3rty.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.herokuapp.prop3rty.service.ApartmentService;

@Controller
@RequestMapping("/apartments")
public class ApartmentsController {
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	ApartmentService aptService;

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
	
	@RequestMapping(value = "/apt_sell", method = RequestMethod.POST)
	public String sellEval() {
		//ModelAndView view = new ModelAndView("apt_sell");
		return "apt_sell";
	}

	@RequestMapping("/apt_rent")
	public ModelAndView rent() {
		ModelAndView view = new ModelAndView("apt_rent");
		return view;
	}
}
