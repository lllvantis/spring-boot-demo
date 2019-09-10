package com.github.lllvantis.spring.boot.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.sql.DataSource;
import java.util.List;

@ConfigurationProperties("vantis.module")
@Data
public class RemoteUrlProperties {
	private String orderSystemUrl;
	private String userSystemUrl;
}
