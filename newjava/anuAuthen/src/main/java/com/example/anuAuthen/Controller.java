package com.example.anuAuthen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/auth")
public class Controller {

	@GetMapping("/welcome")
	public String welcome() {
		return "Hello everyone";
		
	}
}
