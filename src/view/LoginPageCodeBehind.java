package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPageCodeBehind {

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
    void userLogin(ActionEvent event) {
    	
    }
	
    @FXML
    void goToCreateAccountPage(ActionEvent event) {
    	
    }

}
