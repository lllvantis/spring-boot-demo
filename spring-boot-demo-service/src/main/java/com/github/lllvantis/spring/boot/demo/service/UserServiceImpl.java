package com.github.lllvantis.spring.boot.demo.service;

import com.github.lllvantis.spring.boot.demo.User;
import com.github.lllvantis.spring.boot.demo.interfaces.UserService;

public class UserServiceImpl implements UserService {
	private final String userSystemUrl;

	public UserServiceImpl(String userSystemUrl) {
		this.userSystemUrl = userSystemUrl;
	}

	@Override
	public User getUser(String name) {
		User user = new User();
		user.setName(name);
		user.setFrom(userSystemUrl);
		return user;
	}
}
