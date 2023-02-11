package notecards_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model_classes.Notecard;
import model_classes.Notecards;

class TestGetNumberOfNotecards {

	@Test
	void testGetNumberOfNotecards() {
		Notecards notecards = new Notecards();
		Notecard notecard1 = new Notecard("Term1", "This is the definition");
		Notecard notecard2 = new Notecard("Term2", "This is another definition");
		Notecard notecard3 = new Notecard("Term3", "This is the last definition");
		notecards.addNotecard(notecard1);
		notecards.addNotecard(notecard2);
		notecards.addNotecard(notecard3);
		int collectionSize = notecards.getNumberOfNotecards();
		assertEquals(3, collectionSize, "test get number of notecards");
	}
}