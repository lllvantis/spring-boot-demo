package com.github.lllvantis.spring.boot.demo.autoconfig;

import com.github.lllvantis.spring.boot.demo.interfaces.UserService;
import com.github.lllvantis.spring.boot.demo.service.UserServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RemoteUrlProperties.class)
public class SpringBootDemoAutoConfiguration {
	@Bean
	@ConditionalOnMissingBean
	public UserService userService(RemoteUrlProperties remoteUrlProperties) {
		return new UserServiceImpl(remoteUrlProperties.getUserSystemUrl());
	}
}
