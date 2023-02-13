package notecards_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model_classes.Notecard;
import model_classes.Notecards;

class TestConstructor {

	@Test
	void testNotecardsConstructor() {
		Notecards notecards = new Notecards();
		ObservableList<Notecard> notecardList = FXCollections.observableArrayList();
		assertEquals(notecardList, notecards.getNotecards(), "test constructor");
	}
}
