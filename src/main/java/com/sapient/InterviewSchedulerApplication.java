package com.sapient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sapient.utils.PropertyUtils;

@SpringBootApplication
public class InterviewSchedulerApplication implements CommandLineRunner{
	
	@Autowired
	private PropertyUtils propertyUtils;

	public static void main(String[] args) {
		SpringApplication.run(InterviewSchedulerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(propertyUtils.priority1);
		System.out.println(propertyUtils.priority2);
		System.out.println(propertyUtils.slot1);
		System.out.println(propertyUtils.slot2);
	}
}
