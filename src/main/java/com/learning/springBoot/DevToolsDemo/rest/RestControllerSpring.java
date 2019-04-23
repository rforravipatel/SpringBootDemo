package com.learning.springBoot.DevToolsDemo.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerSpring {

	@GetMapping("/")
	public String sayHello() {

		return "Welcome to Server Timezone:" + LocalDateTime.now();
	}

	@GetMapping("/workout")
	public String getDilyWorkout() {

		return "Run a hard 5k";
	}
}
