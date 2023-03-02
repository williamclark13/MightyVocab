package notecards_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import model_classes.Notecard;
import model_classes.Notecards;

class TestConstructor {

	@Test
	void testNotecardsConstructor() {
		Notecards notecards = new Notecards();
		//ObservableList<Notecard> notecardList = FXCollections.observableArrayList();
		List<Notecard> notecardList2 = notecards.getNotecards();
		assertEquals(notecardList2, notecards.getNotecards(), "test constructor");
	}
}
