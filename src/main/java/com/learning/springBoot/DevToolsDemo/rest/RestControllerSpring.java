package com.learning.springBoot.DevToolsDemo.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerSpring {

	@Value("${coach.name}")
	private String coachName;

	@Value("${team.name}")
	private String teamName;

	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach: " + coachName + ", Team name: " + teamName;
	}

	@GetMapping("/")
	public String sayHello() {

		return "Welcome to Server Timezone:" + LocalDateTime.now();
	}

	@GetMapping("/workout")
	public String getDilyWorkout() {

		return "Run a hard 5k";
	}
}
