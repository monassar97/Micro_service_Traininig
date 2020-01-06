package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "com.aspire.training")
public class ProjectConfiguration {
	private String applicationName;
	private String version;

	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getVersion() {

		return this.version;
	}

}
