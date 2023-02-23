package viewmodel;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

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
	
	
}
