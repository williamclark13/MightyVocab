package fileIO_classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import model_classes.User;

public class FileWriter {
	private File userFile;
	
	public FileWriter() {
		this.userFile = new File("../users.txt");
	}
	
	public void write(List<User> users) throws FileNotFoundException {
		if (users == null) {
			throw new IllegalArgumentException(resources.ResourceMessages.LIST_NULL);
		}
		
		try (PrintWriter writer = new PrintWriter(this.userFile)){
			for (User currentUser : users) {
				String output = currentUser.toString();
				
				writer.println(output);
			}
		}
	}
}
