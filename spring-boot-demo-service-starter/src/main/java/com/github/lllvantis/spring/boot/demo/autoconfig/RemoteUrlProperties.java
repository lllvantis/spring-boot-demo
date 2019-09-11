package com.github.lllvantis.spring.boot.demo.autoconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("vantis.module")
@Data
public class RemoteUrlProperties {
	/**
	 * 订单系统 URL
	 */
	private String orderSystemUrl;
	/**
	 * 用户系统 URL
	 */
	private String userSystemUrl;
}
