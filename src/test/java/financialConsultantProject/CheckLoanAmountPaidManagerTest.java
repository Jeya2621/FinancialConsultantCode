package financialConsultantProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckLoanAmountPaidManagerTest {

	/* Test for Amount Paid or Not */
	/* With Correct Details */
	@Test
	public void testAmountPaidorNot() {
		boolean isValid = CheckLoanAmountPaid.amountPaidorNot(24000, 2000);
		// System.out.println(isValid);
		assertTrue(isValid);
	}

	/* With InCorrect Details */
	@Test
	public void test1AmountPaidorNot() {
		boolean isValid = CheckLoanAmountPaid.amountPaidorNot(24000, 1000);
		// System.out.println(isValid);
		assertFalse(isValid);
	}
}
