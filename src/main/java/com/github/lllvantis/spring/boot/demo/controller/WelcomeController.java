package com.github.lllvantis.spring.boot.demo.controller;

import com.github.lllvantis.spring.boot.demo.service.WelcomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	private final WelcomeService welcomeService;

	public WelcomeController(WelcomeService welcomeService) {
		this.welcomeService = welcomeService;
	}

	@GetMapping("/call-order-system")
	public String callOrderSystem(@RequestParam String name) {
		return welcomeService.welcome(name);
	}
}
