package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginPageCodeBehind {

	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	private Hyperlink createaccountHyperlink;

	@FXML
	private Label invalidCredentialsLabel;

	@FXML
	private Button loginButton;

	@FXML
	private PasswordField passwordPasswordField;

	@FXML
	private TextField usernameTextField;

	public LoginPageCodeBehind() {

	}

	@FXML
	private void initialize() {

	}

	@FXML
	void userLogin(ActionEvent event) throws IOException {

		root = FXMLLoader.load(getClass().getResource("NotecardsPage.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	void goToCreateAccountPage(ActionEvent event) throws IOException {

		root = FXMLLoader.load(getClass().getResource("CreateAccountPage.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
