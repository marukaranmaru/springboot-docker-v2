package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerV2Application {
	
	@GetMapping("/message")
	public String getMessage()
	{
		return "Welcome Java Techie";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerV2Application.class, args);
	}

}
