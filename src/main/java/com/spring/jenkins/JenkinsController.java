package com.spring.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

	
	@GetMapping
	public String getstartUp() {
		return "Maven Project Build Successfully!!!!!!!!!";
	}
}
