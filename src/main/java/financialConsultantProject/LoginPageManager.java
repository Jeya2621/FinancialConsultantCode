package financialConsultantProject;

import java.util.*;

public class LoginPageManager {
	static ArrayList<LoginPage> login = new ArrayList<LoginPage>();
	static {
		LoginPage login1 = new LoginPage();
		login1.username = "Jeya";
		login1.password = "jeya123";
		login.add(login1);

		LoginPage login2 = new LoginPage();
		login2.username = "Nandhini";
		login2.password = "nandhini123";
		login.add(login2);

	}

	public static boolean validLogin(String username, String password) {
		boolean isExists = false;
		for (LoginPage Login : login) {
			if (Login.username.equalsIgnoreCase(username) && Login.password.equals(password)) {
				// System.out.println("Successfully Logged In");
				isExists = true;
				break;
			}
			// return isExists;
		}
		return isExists;
	}

	public static boolean newUserRegistration(String username, String password) {
		LoginPage login3 = new LoginPage();
		login3.username = username;
		login3.password = password;
		login.add(login3);
		return true;
	}

	public static void showUser() {
		for (LoginPage list : login) {
			System.out.println(list.username + " " + list.password + " ");
		}
	}

	public static void main(String[] args) {

		newUserRegistration("Yuvaraj", "yuvaraj123");
		showUser();

		validLogin(" jeya", "jeya123");

	}
}
