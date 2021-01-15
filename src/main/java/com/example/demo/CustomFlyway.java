package com.example.demo;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.configuration.Configuration;

/**
 * Custom implementation of flyway. In real project, the code is different from flyway, here to test the spring issue, I just created a stupid class
 */
public class CustomFlyway extends Flyway {

	public CustomFlyway(Configuration configuration) {
		super(configuration);
	}

}
