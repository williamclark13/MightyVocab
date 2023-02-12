package notecards_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model_classes.Notecard;
import model_classes.Notecards;

class TestAddNotecard {

	@Test
	void testNullNotecard() {
		Notecards notecards = new Notecards();
		boolean nullNotecard = false;
		try {
			nullNotecard = notecards.addNotecard(null);
		} catch (Exception exception) {
			exception.getMessage();
		}
		assertEquals(false, nullNotecard, "cannot add null notecard");
	}

	@Test
	void testAddValidNotecard() {
		Notecards notecards = new Notecards();
		Notecard notecard = new Notecard("Term", "This is the definition");
		boolean validNotecard = false;
		try {
			validNotecard = notecards.addNotecard(notecard);
		} catch (Exception exception) {
			exception.getMessage();
		}
		assertEquals(true, validNotecard, "test that notecard was properly added");
	}
}