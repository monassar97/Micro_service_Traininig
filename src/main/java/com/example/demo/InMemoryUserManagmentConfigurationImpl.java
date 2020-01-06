package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;


public class InMemoryUserManagmentConfigurationImpl implements UserManagmentInterface{

	List<User> users = new ArrayList<User>();

	@Value("com.aspire.training.application-name:No application Name provider")
	private String applicationName;

	public void addUser(User user) {
		users.add(user);
	}

	public void printUsers() {
		users.stream().forEach(user -> {
			System.out.println("For application:" + applicationName + "\n" + user);
		});
	}


}
