package com.herokuapp.prop3rty.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.herokuapp.prop3rty.domain.Apartment;
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
	public ModelAndView sell() {
		ModelAndView view = new ModelAndView("apt_sell");
		view.addObject("apt", new Apartment());
		return view;
	}
	
	@RequestMapping(value = "/apt_sell", method = RequestMethod.POST)
	public ModelAndView sellEval(Apartment apt) {
		/*List<FieldError> list = bindingResult.getFieldErrors();
		for (FieldError fe:list) {
			System.out.println(fe.getCode() + ":" + fe.getDefaultMessage());
		}*/
		aptService.evaluate(apt);
		ModelAndView view = new ModelAndView("apt_sell_result");
		view.addObject("aptEval", aptService.evaluate(apt));
		return view;
	}

	@RequestMapping("/apt_rent")
	public ModelAndView rent() {
		ModelAndView view = new ModelAndView("apt_rent");
		return view;
	}
}
