package com.herokuapp.prop3rty.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.herokuapp.prop3rty.domain.Apartment;
import com.herokuapp.prop3rty.service.ApartmentService;

@Controller
public class ApartmentsController {
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	ApartmentService aptService;

	@RequestMapping(value = "/apartments")
	public String index() {
		return "apartamente";
	}

	@RequestMapping(value = "/apartments/apt_sell")
	public String sell(Apartment apt, Model model) {
		model.addAttribute("apt", apt);
		return "apt_sell";
	}
	
	@RequestMapping(value = "/apartments/apt_sell", method = RequestMethod.POST)
	public String sellEval(Apartment apt, Model model) {
		apt.setFinalPrice(aptService.evaluate(apt));
		model.addAttribute("apt", apt);
		return "apt_sell";
	}

	@RequestMapping("/apt_rent")
	public ModelAndView rent() {
		ModelAndView view = new ModelAndView("apt_rent");
		return view;
	}
}
