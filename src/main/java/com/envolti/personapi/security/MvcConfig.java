package com.envolti.personapi.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry
			.addMapping("/*")
				.allowedOrigins("*")
				.allowedMethods("PUT,POST,DELETE,GET")
				.allowedHeaders("Access-Control-Allow-Origin",
						"Access-Control-Allow-Methods",
						"Access-Control-Allow-Headers",
						"Access-Control-Max-Age",
						"Access-Control-Request-Headers",
						"Access-Control-Request-Method")
				.exposedHeaders("Access-Control-Allow-Origin", 
						"Access-Control-Allow-Methods", 
						"Access-Control-Allow-Headers", 
						"Access-Control-Max-Age", 
						"Access-Control-Request-Headers", 
						"Access-Control-Request-Method");
	}

}