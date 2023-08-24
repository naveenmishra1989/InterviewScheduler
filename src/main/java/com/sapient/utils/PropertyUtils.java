package com.sapient.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")
public class PropertyUtils {
	
	@Value("${interview.slot1}")
	public String slot1;
	@Value("${interview.slot2}")
	public String slot2;
	@Value("${interview.slot3}")
	public String slot3;
	@Value("${interview.priority1}")
	public String priority1;
	@Value("${interview.priority2}")
	public String priority2;
	
	

}
