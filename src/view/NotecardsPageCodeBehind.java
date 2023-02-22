package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model_classes.Notecard;

public class NotecardsPageCodeBehind {

	@FXML
	private Button addToSetButton;

	@FXML
	private Button createNotecardButton;

	@FXML
	private TableColumn<Notecard, String> definitionTableColumn;

	@FXML
	private Button deleteNotecardButton;

	@FXML
	private Button editNotecardButton;

	@FXML
	private MenuItem logoutMenuItem;

	@FXML
	private MenuItem notecardsMenuItem;

	@FXML
	private TextField notecardsSearchBarTextField;

	@FXML
	private Button notecardsSearchButton;

	@FXML
	private TableView<Notecard> notecardsTableView;

	@FXML
	private MenuItem setsMenuItem;

	@FXML
	private MenuItem settingsMenuItem;

	@FXML
	private MenuItem studyMenuItem;

	@FXML
	private TableColumn<Notecard, String> termTableColumn;

	@FXML
	private MenuItem userStatisticsMenuItem;

	@FXML
	private Button viewNotecardButton;

	public NotecardsPageCodeBehind() {

	}

	@FXML
	private void initialize() {

	}

	@FXML
	void addNotecardToSet(ActionEvent event) {

	}

	@FXML
	void createNotecard(ActionEvent event) {

	}

	@FXML
	void deleteNotecard(ActionEvent event) {

	}

	@FXML
	void editNotecard(ActionEvent event) {

	}

	@FXML
	void goToNotecardsPage(ActionEvent event) {

	}

	@FXML
	void goToSetsPage(ActionEvent event) {

	}

	@FXML
	void goToSettingsPage(ActionEvent event) {

	}

	@FXML
	void goToStudyPage(ActionEvent event) {

	}

	@FXML
	void goToUserStatisticsPage(ActionEvent event) {

	}

	@FXML
	void searchNotecards(ActionEvent event) {

	}

	@FXML
	void userLogout(ActionEvent event) {

	}

	@FXML
	void viewNotecard(ActionEvent event) {

	}

}
