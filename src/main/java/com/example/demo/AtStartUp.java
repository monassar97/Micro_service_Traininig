package com.example.demo;

import org.springframework.boot.CommandLineRunner;

public class AtStartUp implements CommandLineRunner {

	public AtStartUp() {
		super();
		System.out.println("Instance");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application is started and this method is called");
	}

}
