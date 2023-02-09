package user_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model_classes.User;

class TestVerifyCredentials {

	@Test
	void testInvalidCredentials() {
		User user = new User("Mr Clean", "$!detergent12!$");
		boolean invalid = user.verifyCredentials("Mr Clean", "$detergent12!$");
		assertEquals(false, invalid, "invalid credentials");
	}
	
	@Test
	void testValidCredentials() {
		User user = new User("Mr Clean", "$!detergent12!$");
		boolean valid = user.verifyCredentials("Mr Clean", "$!detergent12!$");
		assertEquals(true, valid, "valid credentials");
	}
}
