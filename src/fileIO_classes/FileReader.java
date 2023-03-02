package fileIO_classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model_classes.User;

public class FileReader {
	private File userFile;

	public FileReader() {
		this.userFile = new File("users.txt");
	}

	public List<User> loadUsersFromFile() throws FileNotFoundException {
		List<User> users = new ArrayList<User>();

		try (Scanner scanner = new Scanner(this.userFile)) {

			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] values = line.split(resources.ResourceMessages.SEPARATOR);

				User user = this.createUser(values);

				users.add(user);
			}
		}
		return users;
	}

	private User createUser(String[] values) {
		String username = values[0];
		String password = values[1];

		User user = new User(username, password);

		return user;
	}
}
