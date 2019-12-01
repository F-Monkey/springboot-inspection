package com.monkey.inspection.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "spring-boot-inspection")
public class InspectionProperties {
	private Boolean enabled;
}
