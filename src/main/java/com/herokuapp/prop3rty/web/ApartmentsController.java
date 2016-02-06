package com.herokuapp.prop3rty.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/apartments")
public class ApartmentsController {
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("apt_sell");
		return view;
	}
}
