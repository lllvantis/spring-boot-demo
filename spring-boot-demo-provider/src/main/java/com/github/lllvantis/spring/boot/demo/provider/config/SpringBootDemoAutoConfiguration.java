package com.github.lllvantis.spring.boot.demo.provider.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SpringBootDemoProperties.class)
public class SpringBootDemoAutoConfiguration {
}
