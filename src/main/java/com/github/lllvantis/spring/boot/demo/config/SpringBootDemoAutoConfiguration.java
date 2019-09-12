package com.github.lllvantis.spring.boot.demo.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({
		RemoteUrlProperties.class,
		SpringBootDemoProperties.class
})
@ComponentScan("com.github.lllvantis.spring.boot.demo.service")
public class SpringBootDemoAutoConfiguration {
}
