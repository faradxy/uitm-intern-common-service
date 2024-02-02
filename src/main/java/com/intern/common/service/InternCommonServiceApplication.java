package com.intern.common.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class InternCommonServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(InternCommonServiceApplication.class, args);
	}
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(InternCommonServiceApplication.class);
    }
}
