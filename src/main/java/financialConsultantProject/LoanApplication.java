package financialConsultantProject;

import java.util.*;

public class LoanApplication {

	static ArrayList<LoginPage> detailLists = new ArrayList<LoginPage>();

	static {

		LoginPage login4 = new LoginPage();
		login4.name = "Jeya";
		login4.fatherName = "SivaKumar";
		login4.age = 21;
		login4.gender = "Female";
		login4.email = "jeya04632@gmail.com";
		login4.address = "4/230,Mettu Street, Nalattinputhur, Kovilpatti";
		login4.mobileNo = 7305166720L;
		login4.adharNo = 987623451202L;
		detailLists.add(login4);

	}

	public static boolean ValidDiplayApplicationForm(String name, String FatherName, int age, String gender,
			String email, long mobileno, long adharno, String address) {

		boolean isExists = false;

		for (LoginPage lists : detailLists) {
			if (lists.name.equalsIgnoreCase(name) && lists.fatherName.equalsIgnoreCase(FatherName) && lists.age == age
					&& lists.gender.equalsIgnoreCase(gender) && lists.email.equalsIgnoreCase(email)
					&& lists.mobileNo == mobileno && lists.adharNo == adharno
					&& lists.address.equalsIgnoreCase(address)) {
				isExists = true;
			}

		}
		return isExists;

	}

}
