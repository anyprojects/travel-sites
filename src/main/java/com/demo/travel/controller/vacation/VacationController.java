package com.demo.travel.controller.vacation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VacationController {
	
	@RequestMapping("/vacation") 
	public String vacation() { 
		return "vacation"; 
	}


}
