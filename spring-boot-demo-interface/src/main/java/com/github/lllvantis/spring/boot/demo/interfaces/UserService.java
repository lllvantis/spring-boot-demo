package com.github.lllvantis.spring.boot.demo.interfaces;

import com.github.lllvantis.spring.boot.demo.User;

public interface UserService {
	/**
	 * 根据用户名获取用户信息
	 * @param name
	 * @return
	 */
	User getUser(String name);
}
