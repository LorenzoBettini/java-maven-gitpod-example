package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void shouldReturnTheExpectedMessage() {
		assertEquals("Hello World!", App.getMessage());
	}
}
