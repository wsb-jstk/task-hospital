package com.capgemini.task.hospital;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Disabled("Just an example")
class ApplicationTest {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	void shouldLoadApplicationContextFromContext() {
		assertNotNull(applicationContext);
	}

}
