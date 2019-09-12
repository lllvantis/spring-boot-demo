package com.github.lllvantis.spring.boot.demo.controller;

import com.github.lllvantis.spring.boot.demo.service.WelcomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	// final 表明自身不会对注入的 Bean 变更
	private final WelcomeService welcomeService;

	// 构造器注入 表示自身依赖于其他 Bean 才可以实例化
	public WelcomeController(WelcomeService welcomeService) {
		this.welcomeService = welcomeService;
	}

	@GetMapping("/call-order-system")
	public String callOrderSystem(@RequestParam String name) {
		return welcomeService.welcome(name);
	}
}
