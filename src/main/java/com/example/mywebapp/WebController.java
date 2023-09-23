package com.example.mywebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@GetMapping(value="endPoint")
	public String getName() {
		return "Gnanavel";
	}
}
