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
import viewmodel.LoginViewModel;

public class LoginPageCodeBehind {

	private LoginViewModel viewModel;

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
		this.viewModel = new LoginViewModel();
	}

	@FXML
	private void initialize() {
		this.bindToLoginViewModel();
		this.invalidCredentialsLabel.visibleProperty().set(true);
	}

	private void bindToLoginViewModel() {
		this.usernameTextField.textProperty().bindBidirectional(this.viewModel.usernameProperty());
		this.passwordPasswordField.textProperty().bindBidirectional(this.viewModel.passwordProperty());
		this.invalidCredentialsLabel.textProperty().bindBidirectional(this.viewModel.labelProperty());

	}

	@FXML
	void goToCreateAccountPage(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("../view/CreateAccountPage.fxml"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	void checkForUser(ActionEvent event) {
		
		this.viewModel.check();
		
	}

}
