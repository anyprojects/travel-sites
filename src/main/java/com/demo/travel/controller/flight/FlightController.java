package com.demo.travel.controller.flight;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FlightController {
	
	@RequestMapping("/flight") 
	public String flight() { 
		return "flight"; 
	}


}
