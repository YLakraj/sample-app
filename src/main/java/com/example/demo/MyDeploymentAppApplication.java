package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController	
public class MyDeploymentAppApplication {

	
	@GetMapping("/")
	public String welcome() {
		
		return "welcome to my app";
		
	}
	
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		
		return "hello from "+input;
		
	}


	
	public static void main(String[] args) {
		SpringApplication.run(MyDeploymentAppApplication.class, args);
	}

}
