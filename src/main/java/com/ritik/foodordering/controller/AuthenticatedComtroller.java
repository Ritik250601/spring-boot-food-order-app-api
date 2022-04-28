package com.ritik.foodordering.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/private")
@RestController
public class AuthenticatedComtroller {
	
	@CrossOrigin
	@PostMapping("/orders")
	public String orderDetails(@RequestBody String str) {
		
		System.out.println(str);
		
		
		return"done";
	}
	

}
