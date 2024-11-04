package com.microservice2.PrductService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PrductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrductServiceApplication.class, args);
	}

}
