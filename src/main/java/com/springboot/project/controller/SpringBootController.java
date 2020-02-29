package com.springboot.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot")
public class SpringBootController {
	
	@GetMapping("/hello")
	public String helloSpringBoot() {
		return "hello spring boot";
	}

}
