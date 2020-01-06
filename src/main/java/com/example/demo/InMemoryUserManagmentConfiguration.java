package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "com.aspire.training.in-memory",name = "enabled",matchIfMissing = false)
public class InMemoryUserManagmentConfiguration {
	@Bean(name="test1")
	public UserManagmentInterface inMemory() {
		return new InMemoryUserManagmentConfigurationImpl();
	}
}
