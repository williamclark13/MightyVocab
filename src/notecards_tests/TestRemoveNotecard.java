package notecards_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model_classes.Notecard;
import model_classes.Notecards;

class TestRemoveNotecard {

	@Test
	void testRemoveNullNotecard() {
		Notecards notecards = new Notecards();
		boolean unwantedNotecard = notecards.removeNotecard(null);
		assertEquals(false, unwantedNotecard, "null notecard cannot be remove");
	}

	@Test
	void testRemoveNotecard() {
		Notecards notecards = new Notecards();
		Notecard notecard = new Notecard("Term", "This is the definition");
		notecards.addNotecard(notecard);
		boolean removed = notecards.removeNotecard(notecard);
		assertEquals(true, removed, "ensure that notecard has been removed");
	}
}
