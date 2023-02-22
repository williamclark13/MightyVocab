package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CreateAccountPageCodeBehind {

	@FXML
	private Button createAccountButton;

	@FXML
	private Label invalidCredentialsLabel;

	@FXML
	private Hyperlink loginpageHyperlink;

	@FXML
	private PasswordField passwordPasswordField;

	@FXML
	private TextField usernameTextField;

	public CreateAccountPageCodeBehind() {

	}

	@FXML
	private void initialize() {

	}
	
    @FXML
    void userCreateAccount(ActionEvent event) {
    	
    }

	@FXML
	void goToLoginPage(ActionEvent event) {
		
	}

}
