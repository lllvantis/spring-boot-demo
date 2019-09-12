package com.github.lllvantis.spring.boot.demo.service;

import com.github.lllvantis.spring.boot.demo.config.RemoteUrlProperties;
import com.github.lllvantis.spring.boot.demo.config.SpringBootDemoProperties;

public class WelcomeServiceImplement implements WelcomeService {
	private final RemoteUrlProperties remoteUrlProperties;
	private final SpringBootDemoProperties springBootDemoProperties;

	public WelcomeServiceImplement(RemoteUrlProperties remoteUrlProperties,
								   SpringBootDemoProperties springBootDemoProperties) {
		this.remoteUrlProperties = remoteUrlProperties;
		this.springBootDemoProperties = springBootDemoProperties;
	}

	@Override
	public String welcome(String name) {
		return springBootDemoProperties.getWelcome() + name + ": " + remoteUrlProperties.getOrderSystemUrl();
	}
}
