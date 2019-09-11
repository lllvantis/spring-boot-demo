package com.github.lllvantis.spring.boot.demo.provider.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("vantis.spring-boot-demo")
@Data
public class SpringBootDemoProperties {
	private String welcome;
}
