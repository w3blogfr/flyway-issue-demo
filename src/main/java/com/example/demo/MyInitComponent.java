package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class MyInitComponent {

	/**
	 * This method is just an example (could be used to load a cache, to trigger any action needed on startup). The request is to make sure flyway is executed because that part.
	 * 
	 * It's the case with the default FlywayAutoConfiguration, and it's not the case when we implement our own CustomFlywayConfiguration.
	 */
	@PostConstruct
	public void init() {
		System.out.println("MyComponent.init should be executed after the flyway migration. It's not the case anymore once we create our own Flyway");
	}
}
