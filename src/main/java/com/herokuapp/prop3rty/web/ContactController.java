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

	/**
	 * Returns the contact form view.
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("contact");
		return view;
	}
	
	/**
	 * Method to handle the post of Contact formular.
	 * @param contact - the contact form.
	 * @return success view or error view.
	 */
	@RequestMapping(value = "/postContactForm", method = RequestMethod.POST)
	public ModelAndView saveOrUpdateUser(@ModelAttribute("contactForm") ContactForm contact) {
		boolean success = true;
		
		//...
		
		ModelAndView returnedView;
		if(success) { 
			returnedView = new ModelAndView("contactFormSuccess");
		} else {
			returnedView = new ModelAndView("contactFormError");

		}
		return returnedView;
		
	}
	
}
