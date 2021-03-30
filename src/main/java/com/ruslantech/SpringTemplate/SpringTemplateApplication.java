package com.ruslantech.SpringTemplate;

import com.ruslantech.SpringTemplate.service.RestService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTemplateApplication implements CommandLineRunner {

	private RestService restService;

	public SpringTemplateApplication(RestService restService) {
		this.restService = restService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringTemplateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		restService.getUsersWithCookies();

		restService.createUser();

		restService.updateUser();

		restService.deleteUser();
	}
}
