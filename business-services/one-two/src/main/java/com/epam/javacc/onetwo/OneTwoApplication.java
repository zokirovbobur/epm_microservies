package com.epam.javacc.onetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OneTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneTwoApplication.class, args);
	}

}
