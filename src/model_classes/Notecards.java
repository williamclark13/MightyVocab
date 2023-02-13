package model_classes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Notecards {
	private ObservableList<Notecard> notecards;

	/**
	 * Instantiates an instance of a collectible of notecard
	 */
	public Notecards() {
		this.notecards = FXCollections.observableArrayList();
	}

	/**
	 * Get notecards
	 * 
	 * @return get the notecards
	 */
	public ObservableList<Notecard> getNotecards() {
		return this.notecards;
	}

	/**
	 * Get the amount of notecards
	 * 
	 * @return amount of notecards
	 */
	public int getNumberOfNotecards() {
		return this.notecards.size();
	}

	/**
	 * Add a notecard
	 * 
	 * @param notecard
	 * @return true if successfully added, false otherwise
	 */
	public boolean addNotecard(Notecard notecard) {
		if (notecard == null) {
			return false;
		}
		return this.notecards.add(notecard);
	}

	/**
	 * Add all notecards
	 * 
	 * @param notecard
	 * @return true if successfully added, false otherwise
	 */
	public boolean addNotecards(ObservableList<Notecard> notecards) {
		if (notecards == null) {
			return false;
		}
		return this.notecards.addAll(notecards);
	}

	/**
	 * Remove an unwanted notecard
	 * 
	 * @param notecard
	 * @return true if successfully removed, false otherwise
	 */
	public boolean removeNotecard(Notecard unwantedNotecard) {
		if (unwantedNotecard == null) {
			return false;
		}
		return this.notecards.remove(unwantedNotecard);
	}

	/**
	 * Remove all unwanted notecards
	 * 
	 * @param unwantedNotecards
	 * @return true if removed, false otherwise
	 */
	public boolean removeNotecards(ObservableList<Notecard> unwantedNotecards) {
		if (unwantedNotecards == null) {
			return false;
		}
		return this.notecards.removeAll(unwantedNotecards);
	}
}