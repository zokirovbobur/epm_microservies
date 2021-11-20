package com.epam.javacc.two;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
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
				"Hello from two service");
	}
}
