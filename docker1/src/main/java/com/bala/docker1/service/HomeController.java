package com.bala.docker1.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author bala
 *
 */
@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "Hello docker world!";
	}
}
