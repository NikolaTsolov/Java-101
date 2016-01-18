package friday;

import java.util.prefs.InvalidPreferencesFormatException;

import javax.activity.InvalidActivityException;
import javax.naming.InvalidNameException;

public class BankAccount {

	class InvalidInputExeption extends Exception{
		public InvalidInputExeption() {super();}
		public InvalidInputExeption(String message) {
			super(message);
		}
	}

	
	private static int code=0;
	private final int ID;
	private String firstName;
	private String lastName;
	private int age;
	private int balance;
	private int interest;
	private String interestType;

	public BankAccount(String firstName, String lastName, int age,
								int interest, String interestType) {
		try {
			if (validate(firstName, lastName, age, interest, interestType)) {
				throw new InvalidInputExeption();
			} else {
			}
		} catch (InvalidInputExeption ex) {
		}

	}

	public boolean validate(String firstName, String lastName, String age, String interest, String interestType) {
		try {
			if (!firstName.matches("^[A-Z][a-z]{1,20}")) {
				throw new InvalidInputExeption("Invalid First Name");
			} else if (!lastName.matches("^[A-Z][a-z]{1,20}")) {
				throw new InvalidInputExeption("Invalid Last Name");
			} else if (!age.matches("[0-9]{1,3}")) {
				throw new InvalidAge();
			} else if (!interest.matches("[0-5]")) {
				throw new InvalidInterest();
			} else if (!interestType.equals("simple") && !(interestType.equals("complex"))) {
				throw new InvalidInterestType();
			} else
				return true;
		} catch (InvalidFirstNameExeption ex) {
			System.out.println("Invalid First Name");
		} catch (InvalidLastNameExeption ex) {
			System.out.println("Invalid Last Name");
		} catch (InvalidAge ex) {
			System.out.println("Invalid Age");
		} catch (InvalidInterest ex) {
			System.out.println("Invaid Interest");
		} catch (InvalidInterestType ex) {
			System.out.println("Invalid Interest Type");
		}
		return false;
	}

	public void add(int deposit) {
		try {
			if (deposit < 0) {
				throw new InvalidDeposit();
			}
			balance = balance + deposit;
		} catch (InvalidDeposit ex) {
			System.out.println("Invalid Deposit Value");
		}
	}

	public void withrdraw(int value) {
		try {
			if ()
		}
		if (value < 0 || (balance - value) < 0) {

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount nik = new BankAccount("Nikola", "Ts", "49", "5", "simple");
		nik.add(13);

	}

}
