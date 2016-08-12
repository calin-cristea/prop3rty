package com.cristeanet.prop3rty.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LandsController {

	@RequestMapping("/lands")
	public String index() {
		return "terenuri";

	}

	@RequestMapping("/lands/land_sell")
	public String sell() {
		return "land_sell";
	}

}
