package model_classes;

/**
 * User Class
 * @author William Clark
 * @version 2/6/2023
 */
public class User {
	private String username;
	private String password;
	
	/**
	 * Instantiates an instance of a User
	 * @param username
	 * @param password
	 */
	public User(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}
	
	/**
	 * Gets username
	 * @return username
	 */
	public String GetUsername() {
		return this.username;
	}
	
	/**
	 * Functionality to set the username
	 * @param username
	 * @return true if username is being set
	 */
	public boolean setUsername(String username) {
		if (username == null) {
			throw new IllegalArgumentException("Username cannot be null.");
		}
		if (username.isEmpty()) {
			throw new IllegalArgumentException("Username cannot be empty.");
		}
		this.username = username;
		return true;
	}
	
	/**
	 * Gets password
	 * @return password
	 */
	public String GetPassword() {
		return this.password;
	}
	
	/**
	 * Functionality to set the password
	 * @param password
	 * @return true if password is being set
	 */
	public boolean setPassword(String password) {
		if (password == null) {
			throw new IllegalArgumentException("Password cannot be null.");
		}
		if (password.isEmpty()) {
			throw new IllegalArgumentException("Password cannot be empty.");
		}
		this.password = password;
		return true;
	}
}
