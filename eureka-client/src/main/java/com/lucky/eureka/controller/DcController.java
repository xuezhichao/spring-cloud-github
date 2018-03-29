package com.lucky.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {
	
	@GetMapping("/dc")
	public String dc() {
		return "services";
	}
}
