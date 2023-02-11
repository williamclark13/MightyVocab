package notecards_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model_classes.Notecard;
import model_classes.Notecards;

class TestRemoveNotecards {

	@Test
	void testRemoveNullNotecards() {
		Notecards notecards = new Notecards();
		boolean nullNotecard = notecards.removeNotecards(null);
		assertEquals(false, nullNotecard, "null notecard cannot be removed");
	}

	@Test
	void testRemoveNotecards() {
		Notecards notecards = new Notecards();
		ObservableList<Notecard> unwantedNotecards = FXCollections.observableArrayList();
		Notecard notecard1 = new Notecard("Term1", "This is the definition");
		Notecard notecard2 = new Notecard("Term2", "This is another definition");
		Notecard notecard3 = new Notecard("Term3", "This is the last definition");
		unwantedNotecards.add(notecard1);
		unwantedNotecards.add(notecard2);
		unwantedNotecards.add(notecard3);
		notecards.addNotecards(unwantedNotecards);
		boolean removed = notecards.removeNotecards(unwantedNotecards);
		assertEquals(true, removed, "ensure that notecards have been removed");
	}
}
