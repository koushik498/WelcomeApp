package com.example.demo.Controllers;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController 
{
	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		String str = "Good Morning koushik";
		
		return str;
	}
}
