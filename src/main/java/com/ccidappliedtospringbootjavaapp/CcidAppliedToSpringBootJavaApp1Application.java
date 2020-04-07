package com.ccidappliedtospringbootjavaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CcidAppliedToSpringBootJavaApp1Application {

	@RequestMapping("/")
	public String GetHome() {
		return "You are home";
	}
	public static void main(String[] args) {
		SpringApplication.run(CcidAppliedToSpringBootJavaApp1Application.class, args);
	}

}
