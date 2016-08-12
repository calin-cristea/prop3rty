package com.cristeanet.prop3rty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class ApplicationTests {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationTests.class, args);

	}
}
