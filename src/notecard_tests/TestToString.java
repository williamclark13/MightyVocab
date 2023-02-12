package notecard_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model_classes.Notecard;

class TestToString {

	@Test
	void testToString() {
		Notecard notecard = new Notecard("Term", "This is the definition");
		String expectedString = "Term: " + notecard.getTerm() + System.lineSeparator() + "Definition: "
				+ notecard.getDefinition();
		assertEquals(expectedString, notecard.toString());
	}
}