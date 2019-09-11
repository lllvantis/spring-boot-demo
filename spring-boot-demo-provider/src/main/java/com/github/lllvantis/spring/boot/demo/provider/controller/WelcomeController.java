package com.github.lllvantis.spring.boot.demo.provider.controller;

import com.github.lllvantis.spring.boot.demo.User;
import com.github.lllvantis.spring.boot.demo.interfaces.UserService;
import com.github.lllvantis.spring.boot.demo.provider.config.SpringBootDemoProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	private final UserService userService;
	private final SpringBootDemoProperties springBootDemoProperties;

	public WelcomeController(UserService userService,
							 SpringBootDemoProperties springBootDemoProperties) {
		this.userService = userService;
		this.springBootDemoProperties = springBootDemoProperties;
	}

	@GetMapping("/call-order-system")
	public String callOrderSystem(@RequestParam String name) {
		User user = userService.getUser(name);
		return springBootDemoProperties.getWelcome() + user.getName() + " from " + user.getFrom();
	}
}
