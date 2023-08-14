package io.grissom.adminservice.controller;

import io.grissom.adminservice.controller.limit.RequestLimit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.grissom.adminservice.service.GreetingService;

@RestController
public class GreetingController {

	@Autowired
	private GreetingService greetingService;

	@GetMapping("/greeting")
	@RequestLimit(count = 20)
	public Object greeting() {
		return greetingService.greeting();
	}
}
