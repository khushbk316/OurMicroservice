package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class MusixServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(MusixServiceApplication.class, args);
	}

}
