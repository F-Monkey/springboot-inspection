package com.monkey.inspection.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.monkey.inspection.config.properties.InspectionProperties;

import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableConfigurationProperties(InspectionProperties.class)
@Slf4j
public class InspectionConfig implements ApplicationRunner{
	
	@Autowired
	InspectionProperties inspectionProperties;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("inspection enabled:{}",inspectionProperties.getEnabled());
		if(Boolean.TRUE.equals(inspectionProperties.getEnabled())) {
			start();
		}
	}
	
	private void start() {
		
	}
	
}
