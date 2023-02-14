package accountmanager_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model_classes.AccountManager;
import model_classes.Notecards;
import model_classes.User;

class TestAdd {

	@Test
	void testNullKey() {
		AccountManager testManager = new AccountManager();
		Notecards testValue = new Notecards();
		
		assertThrows(IllegalArgumentException.class, () -> {
			testManager.add(null, testValue);
		});
	}
	
	@Test
	void testNullValue() {
		AccountManager testManager = new AccountManager();
		User testUser = new User("michael", "lee");
		
		assertThrows(IllegalArgumentException.class, () -> {
			testManager.add(testUser, null);
		});
	}
	
	@Test
	void testUserAlreadyExistsInMap() {
		AccountManager testManager = new AccountManager();
		User testUser = new User("michael", "lee");
		Notecards testValue = new Notecards();
		testManager.add(testUser, testValue);
		
		boolean result =  testManager.add(testUser, testValue); // Why won't it pass when creating object in line
		
		assertEquals(false, result);
	}
	
	@Test
	void testValidAdd() {
		AccountManager testManager = new AccountManager();
		User testUser = new User("michael", "lee");
		Notecards testValue = new Notecards();
		
		boolean result =  testManager.add(testUser, testValue);
		
		assertEquals(true, result);
	}

}
