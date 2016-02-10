package com.herokuapp.prop3rty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.herokuapp.prop3rty.dao.UserDAO;
import com.herokuapp.prop3rty.dao.db.UserRepository;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	/*@Bean
	public UserDAO userDao() {
		return new UserRepository("postgresql.cristeanet.com", "5432", "prop3rty", "prop3rty", "user.prop3rty");

	}*/

}
