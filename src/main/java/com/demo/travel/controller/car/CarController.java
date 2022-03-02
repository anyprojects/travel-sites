package com.demo.travel.controller.car;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {
	
	@RequestMapping("/car") 
	public String car() { 
		return "car"; 
	}


}
