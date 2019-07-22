package com.ravindra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootHelloWorldApplication extends SpringBootServletInitializer {
	
	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder builder)
	{
		return builder.sources(SpringBootHelloWorldApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
}