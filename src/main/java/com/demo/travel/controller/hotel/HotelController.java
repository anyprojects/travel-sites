package com.demo.travel.controller.hotel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HotelController {
	
	@RequestMapping("/hotel") 
	public String hotel() { 
		return "hotel"; 
	}


}
