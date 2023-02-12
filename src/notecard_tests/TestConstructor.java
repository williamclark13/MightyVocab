package notecard_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import model_classes.Notecard;
import model_classes.User;

class TestConstructor {

	@Test
	void testNullTerm() {
		assertThrows(IllegalArgumentException.class, () -> {
			new User(null, "This is the definition");
		});
	}

	@Test
	void testEmptyTerm() {
		assertThrows(IllegalArgumentException.class, () -> {
			new User("", "This is the definition");
		});
	}

	@Test
	void testNullDefinition() {
		assertThrows(IllegalArgumentException.class, () -> {
			new User("Term", null);
		});
	}

	@Test
	void testEmptyDefinition() {
		assertThrows(IllegalArgumentException.class, () -> {
			new User("Term", "");
		});
	}

	@Test
	void testValidConstructor() {
		Notecard notecard = new Notecard("Term", "This is the definition");
		assertEquals("Term", notecard.getTerm(), "term is valid");
		assertEquals("This is the definition", notecard.getDefinition(), "definition is valid");
	}
}