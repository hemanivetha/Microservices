package com.hema.SpringBootDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDemoApplication {
	
	@Value("${spring.application.name}")
	private String name;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
		
	}
	
	@RequestMapping(value="/")
	public String getName() {
		return name;
	}

}
