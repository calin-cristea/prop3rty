package com.herokuapp.prop3rty.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.herokuapp.prop3rty.forms.ContactForm;

@Controller
@RequestMapping("/contact")
public class ContactController {

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("contact");
		return view;
	}
	
	@RequestMapping(value = "/postContactForm", method = RequestMethod.POST)
	public ModelAndView saveOrUpdateUser(@ModelAttribute("contactForm") ContactForm contact) {
		System.out.println("AM INTRAT IN METODA DE POST!");
		ModelAndView view = new ModelAndView(contact.getName());
		System.out.println("IESIM DIN METODA DE POST!");

		return view;
		
	}
	
}
