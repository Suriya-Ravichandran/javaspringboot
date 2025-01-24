package com.example.anuAuthen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class AnuAuthenApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnuAuthenApplication.class, args);
	}

}
