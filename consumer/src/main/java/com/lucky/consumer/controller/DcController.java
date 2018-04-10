package com.lucky.consumer.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucky.consumer.service.DcClientService;

@RestController
public class DcController {

	@Autowired
	DcClientService dcClientService;
	
	@GetMapping("/consumer")
	public String dc() {
		return dcClientService.cousumer();
	}
}
