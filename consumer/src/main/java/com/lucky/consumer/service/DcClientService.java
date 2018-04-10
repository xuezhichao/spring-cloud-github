package com.lucky.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("eureka-client")
public interface DcClientService {

	@RequestMapping(value="/dc",method=RequestMethod.GET)
	String cousumer();
}
