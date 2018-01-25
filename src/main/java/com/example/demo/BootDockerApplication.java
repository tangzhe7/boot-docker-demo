package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootDockerApplication
{
	
	@Value("${app.env}")
	private String env;

	@RequestMapping("/")
	public String home()
	{
		return "Hello Docker World-this env "+env;
	}

	public static void main(String[] args)
	{
		SpringApplication.run(BootDockerApplication.class, args);
	}

}
