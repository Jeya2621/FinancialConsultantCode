package financialConsultantProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoanApplicationManagerTest {

	/* Test with Correct Details for Loan Application */
	@Test
	public void testWithCorrectDetails() {
		String name = "jeya";
		String fatherName = "SivaKumar";
		int age = 21;
		long mobileNo = 7305166720L;
		long aadharNo = 987623451202L;
		String gender = "Female";
		String email = "jeya04632@gmail.com";
		String aadress = "4/230,Mettu Street, Nalattinputhur, Kovilpatti";
		// LoanApplication.displayLoans(name, fatherName, age, gender, email, mobileNo,
		// aadharNo, aadress);
		boolean isValid = LoanApplication.ValidDiplayApplicationForm(name, fatherName, age, gender, email, mobileNo,
				aadharNo, aadress);
		assertTrue(isValid);
	}

	/* Test with Incorrect Details for Loan Application */
	@Test
	public void testWithInCorrectDetails() {
		String name = "jeya";
		String fatherName = "venkadalakshmi";
		int age = 21;
		long mobileNo = 7305166720L;
		long aadharNo = 987678654321L;
		String gender = "Female";
		String email = "jeya04632@gmail.com";
		String aadress = "4/230,Mettu Street,Kovilpatti.";
		// LoanApplication.displayLoans(name, fatherName, age, gender, email, mobileNo,
		// aadharNo, aadress);
		boolean isValid = LoanApplication.ValidDiplayApplicationForm(name, fatherName, age, gender, email, mobileNo,
				aadharNo, aadress);
		assertFalse(isValid);
	}

}
