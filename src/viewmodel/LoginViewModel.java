package viewmodel;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import fileIO_classes.FileReader;
import fileIO_classes.FileWriter;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model_classes.User;

public class LoginViewModel {
	private List<User> users;
	private StringProperty usernameProperty;
	private StringProperty passwordProperty;
	private StringProperty labelProperty;
	
	public LoginViewModel() {
		this.users = new ArrayList<User>();
		this.usernameProperty = new SimpleStringProperty();
		this.passwordProperty = new SimpleStringProperty();
		this.labelProperty = new SimpleStringProperty();
	}
	
	public StringProperty usernameProperty() {
		return this.usernameProperty;
	}
	
	public StringProperty passwordProperty() {
		return this.passwordProperty;
	}
	
	public StringProperty labelProperty() {
		return this.labelProperty;
	}
	
	// Check for username and password being correct and in file.
	// If on Create Account page then on button press create method to handle adding username and password to file
	// Maybe move these methods below to code behind since it deals with fxml, instead just focus on saving to file and checking file for name
	
	public void check() {
		try {
			FileReader reader = new FileReader();
			this.users = reader.loadUsersFromFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		if (users != null) {
			for(User currentUser : users) {
				if (currentUser.verifyCredentials(usernameProperty.get(), passwordProperty.get())) {
					
					this.labelProperty.set("User exists");
				}
		}
		
		}
	}
	
	public void createUserAccount() {
		try {
			FileWriter writer = new FileWriter();
			writer.write(users);
		} catch (FileNotFoundException e) {
			
		}
	}
	
	
}
