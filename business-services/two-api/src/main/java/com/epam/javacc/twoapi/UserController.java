package com.epam.javacc.twoapi;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class UserController {
	@Autowired
	private EurekaClient eurekaClient;

	@GetMapping
	public GeneralAnswer<Object> testController(){
		return new GeneralAnswer<>(
				"Hello from two-api service");
	}
}
