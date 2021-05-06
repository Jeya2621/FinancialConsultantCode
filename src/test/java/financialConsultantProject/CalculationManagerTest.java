package financialConsultantProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationManagerTest {

	/* For Interest Calculation Check */

	@Test
	public void test1HomeLoan() {
		// int amount = 1000000;
		int interest = Calculation.calculationOfHouseLoan(1000000);
		assertEquals(-20000, interest);
	}

	@Test
	public void test2HomeLoan() {
		// int amount = 2500000;
		int interest = Calculation.calculationOfHouseLoan(2500000);
		assertEquals(75000, interest);
	}

	@Test
	public void test3HouseLoan() {
		// int amount = 5000000;
		int interest = Calculation.calculationOfHouseLoan(5000000);
		assertEquals(250000, interest);
	}

	@Test
	public void testEducationLoan() {
		// int amount = 200000;
		int interest = Calculation.calculationOfEducationLoan(200000);
		assertEquals(4000, interest);
	}

	@Test
	public void testAgriLoan() {
		// int amount = 7000;
		// int acre = 22 ;
		int interest = Calculation.calculationOfAgriLoan(22);
		assertEquals(1540, interest);
	}

	@Test
	public void testPersonalLoan() {
		// int amount = 300000;
		int interest = Calculation.calculationOfPersonalLoan(300000);
		assertEquals(9000, interest);
	}

	@Test
	public void test1GoldLoan() {
		// String goldType = "22k";
		// int gram = 22;
		// int amount = 3000;
		int interest = Calculation.calculationOfGoldLoan("22K", 22);
		assertEquals(660, interest);
	}

	@Test
	public void test2GoldLoan() {
		int interest = Calculation.calculationOfGoldLoan("24K", 21);
		assertEquals(735, interest);
	}

	@Test
	public void test1VehicleLoan() {
		int interest = Calculation.calculationOfVehicleLoan("twowheeler");
		assertEquals(6000, interest);
	}

	@Test
	public void test2VehicleLoan() {
		int interest = Calculation.calculationOfVehicleLoan("fourwheeler");
		assertEquals(15000, interest);
	}

	@Test
	public void test3VehicleLoan() {
		int interest = Calculation.calculationOfVehicleLoan("others");
		assertEquals(21000, interest);
	}

}
