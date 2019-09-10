package com.github.lllvantis.spring.boot.demo.config;

import com.github.lllvantis.spring.boot.demo.service.WelcomeService;
import com.github.lllvantis.spring.boot.demo.service.WelcomeServiceImplement;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({
		RemoteUrlProperties.class,
		SpringBootDemoProperties.class
})
public class SpringBootDemoAutoConfiguration {
	@Bean
	@ConditionalOnMissingBean
	public WelcomeService welcomeService(RemoteUrlProperties remoteUrlProperties,
										 SpringBootDemoProperties springBootDemoProperties) {
		return new WelcomeServiceImplement(remoteUrlProperties, springBootDemoProperties);
	}
}
