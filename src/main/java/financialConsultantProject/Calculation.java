package financialConsultantProject;

public class Calculation {

	private static final int EDUCATION_LOAN_MAX_LIMIT = 500000;
	private static final int PERSONAL_LOAN_MAX_LIMIT = 1000000;

	/**
	 * 10L = 2% interest 25L = 3% interest 50L = 5% interest
	 */

	public static int calculationOfHouseLoan(int amount) {
		int interestamount = 0;
		if (amount == 1000000) {
			interestamount = (amount * 2) / 100;
		} else if (amount == 2500000) {
			interestamount = (amount * 3) / 100;
		} else if (amount == 5000000) {
			interestamount = (amount * 5) / 100;
		}
		return interestamount;
	}

	/**
	 * Education Loan = 2% interest
	 */

	public static int calculationOfEducationLoan(int amount) {
		int interestamount = 0;
		if (amount > 0 && amount <= EDUCATION_LOAN_MAX_LIMIT) {
			interestamount = (amount * 2) / 100;
		}
		return interestamount;
	}

	/**
	 * Personal Loan = 2% interest
	 */

	public static int calculationOfPersonalLoan(int amount) {
		int interestamount = 0;
		if (amount > 0 && amount <= PERSONAL_LOAN_MAX_LIMIT) {
			interestamount = (amount * 3) / 100;
		}
		return interestamount;
	}

	/**
	 * Gold Loan = 1% interest
	 */

	public static int calculationOfGoldLoan(String goldType, int quantityOfGold) {
		int amount, interestamount = 0;
		if (goldType.equals("22K")) {
			amount = (quantityOfGold * 3000);
			interestamount = (amount * 1) / 100;
		} else if (goldType.equals("24K")) {
			amount = (quantityOfGold * 3500);
			interestamount = (amount * 1) / 100;
		}
		return interestamount;
	}

	/**
	 * Agri Loan = 1% interest
	 */

	public static int calculationOfAgriLoan(int acre) {
		int amount, interestamount = 0;
		if (acre > 0 && acre <= 100) {
			amount = acre * 7000;
			interestamount = (amount * 1) / 100;
		}
		return interestamount;
	}

	/**
	 * Vehicle Loan = 3% interest
	 */

	public static int calculationOfVehicleLoan(String vehicleType) {
		int amount, interestamount = 0;
		if (vehicleType.equals("twowheeler")) {
			amount = 200000;
			interestamount = (amount * 3) / 100;
		} else if (vehicleType.equals("fourwheeler")) {
			amount = 500000;
			interestamount = (amount * 3) / 100;
		} else if (vehicleType.equals("others")) {
			amount = 700000;
			interestamount = (amount * 3) / 100;
		}
		return interestamount;
	}
}
