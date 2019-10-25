package com.hema.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BankUserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankUserserviceApplication.class, args);
	}

}
