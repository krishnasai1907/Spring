package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	
	@Bean
	public Redmi getMobile()
	{
		return new Redmi();
		
	}
	
}
