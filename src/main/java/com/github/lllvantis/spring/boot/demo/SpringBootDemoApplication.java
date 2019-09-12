package com.github.lllvantis.spring.boot.demo;

import com.github.lllvantis.spring.boot.demo.config.RemoteUrlProperties;
import com.github.lllvantis.spring.boot.demo.config.SpringBootDemoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigurationProperties({
		RemoteUrlProperties.class,
		SpringBootDemoProperties.class
})
public class SpringBootDemoApplication {
	@Autowired
	RemoteUrlProperties remoteUrlProperties;
	@Autowired
	SpringBootDemoProperties springBootDemoProperties;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

    @GetMapping("/call-order-system")
	public String callOrderSystem(@RequestParam String name) {
		return springBootDemoProperties.getWelcome() + name + ": " + remoteUrlProperties.getOrderSystemUrl();
	}
}
