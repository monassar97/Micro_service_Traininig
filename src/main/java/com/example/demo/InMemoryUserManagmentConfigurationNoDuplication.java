package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "com.aspire.training.in-memory-no-dpl",name = "enabled",matchIfMissing = true)
public class InMemoryUserManagmentConfigurationNoDuplication {
	@Bean(name="test2")
	public UserManagmentInterface inMemory() {
		return new InMemoryUserManagmentConfigurationImplNoDpulication();
	}
}
