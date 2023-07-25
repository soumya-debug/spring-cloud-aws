package com.spring.aws.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringcloudApplication {
	
	@GetMapping("/")
	public String home() {
		return "WELLCOME TO AWS FIRST DEPLOYMENT......!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudApplication.class, args);
	}

}
