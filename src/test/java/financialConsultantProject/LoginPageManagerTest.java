package financialConsultantProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginPageManagerTest {
	
	/* For New User Test */
	
	@Test
	public void testForNewUser() {
		String name = "Yuvaraj";
		String password = "yuvaraj123";
		boolean isValid = LoginPageManager.newUserRegistration(name, password);
		//System.out.println(isValid);
		assertTrue(isValid);
	}
	
    /* For Valid Username Password Test */
	
	@Test
	public void testValidLogin() {
		String name="jeya";
		String password="jeya123";
		boolean isExist=LoginPageManager.validLogin(name, password);
		assertTrue(isExist);
		
	}
	
	 /* For InValid Username Password Test */
	
	@Test
	public void testInValidLogin() {
		String name = "jeyas";
		String password = "12345";
		boolean isExist = LoginPageManager.validLogin(name, password);
		assertFalse(isExist);
	}
	
	@Test
	public void testDisplay() {
		DisplayLoans.display();
	}
	
	
}
