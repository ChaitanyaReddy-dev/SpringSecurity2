package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityGaurd {
	@GetMapping("details")
	public String display() {
		return "<h1>Welcome Back <h1>";
	}
	@GetMapping("admin")
	public String admin() {
		return "<h1>Welcome Back Admin<h1>";
	}
	@GetMapping("user")
	public String user() {
		return "<h1>Welcome Back user<h1>";
	}
	
}
