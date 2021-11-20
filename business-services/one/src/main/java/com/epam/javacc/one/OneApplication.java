package com.epam.javacc.one;

import com.netflix.discovery.EurekaClient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RequestMapping
@RestController
public class OneApplication {

	@Autowired
	private EurekaClient eurekaClient;

	@GetMapping
	public GeneralAnswer<Object> testController(){
		return new GeneralAnswer<>(
				"Hello from one service");
	}

	public static void main(String[] args) {
		SpringApplication.run(OneApplication.class, args);
	}

	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	public class GeneralAnswer<T> {
		private String result;
		private String error;
		private T object;

		public GeneralAnswer(T object) {
			this.result = "success";
			this.object = object;
		}
	}
}
