package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AtStartupConfiguration {

	@Bean
	public CommandLineRunner startUp(List<UserManagmentInterface> managment,
			org.springframework.core.env.Environment env) {
		return args -> {
			managment.stream().peek(um -> um.addUser(new User("mosa", "1")))
					.forEach(UserManagmentInterface::printUsers);
		};
	}

	@Bean
	public CommandLineRunner startUp2(List<UserManagmentInterface> managment, ProjectConfiguration properties) {
		return args -> {
			System.out.println("FROM POJO: " + properties.getApplicationName());
			System.out.println("FROM POJO: " + properties.getVersion());
			managment.stream().peek(um -> um.addUser(new User("mosa", "1")))
					.peek(um -> um.addUser(new User("emad", "1"))).forEach(UserManagmentInterface::printUsers);
		};
	}
}
