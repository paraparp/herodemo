package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


class Controller {

	
	
	
	@GetMapping("/")
	public String test ()  {
		
		return "Funciona!!";
			}
	
}
