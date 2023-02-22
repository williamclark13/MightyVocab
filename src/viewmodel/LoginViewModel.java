package viewmodel;

import java.io.IOException;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginViewModel {
	private StringProperty usernameProperty;
	private StringProperty passwordProperty;
	
	public LoginViewModel() {
		this.usernameProperty = new SimpleStringProperty();
		this.passwordProperty = new SimpleStringProperty();
	}
	
	public StringProperty usernameProperty() {
		return this.usernameProperty;
	}
	
	public StringProperty passwordProperty() {
		return this.passwordProperty;
	}
	
	// Check for username and password being correct and in file.
	// If on Create Account page then on button press create method to handle adding username and password to file
	// Maybe move these methods below to code behind since it deals with fxml, instead just focus on saving to file and checking file for name
	
	private void goToCreateAccountPage() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("newFxml.fxml"));
		try {
			Parent root = (Parent) fxmlLoader.load();
			Scene scene = new Scene(root, 600, 65);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void goToLoginPage() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("newFxml.fxml"));
		try {
			Parent root = (Parent) fxmlLoader.load();
			Scene scene = new Scene(root, 600, 65);
			//jfxPanel.setScene(scene);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
