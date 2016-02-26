package wednesday;

import java.io.IOException;
import java.lang.reflect.Executable;
import java.util.Scanner;

public class UserInputChecker {
	
	interface Validator {
		public void validate(String input) throws InvalidInputExeption;
	}
	
	class InvalidInputExeption extends Exception {
		public InvalidInputExeption() {
			super();
		}
		public InvalidInputExeption(String message) {
			super(message);
		}
	}
	
	class PersonNameValidator implements Validator {
		@Override
		public void validate(String input) {
			String[] names = input.split(" ");
			try {
				if(names.length == 3) {
					throw new InvalidInputExeption();
				}
			}
			catch(InvalidInputExeption ex) {
				System.out.println("Fail");
			}
			
		}
	}
	
	PersonNameValidator nameValidate = new PersonNameValidator();
	
	class BulgarianPhoneNumberValidator implements Validator {
		@Override
		public void validate(String input) {
			boolean isBG = input.startsWith("359");
			boolean isNumber = input.matches("\\d{12}");
			if(isBG && isNumber) {
				
			}
		}
	}
	BulgarianPhoneNumberValidator bgPhoneValidate = new BulgarianPhoneNumberValidator();
	
	class PersonAgeValidator implements Validator {

		@Override
		public void validate(String input) {
			boolean isAge = input.matches("\\d{1,3}");
			if(isAge) {
				
			}
		}		
	}
	
	PersonAgeValidator ageValidate = new PersonAgeValidator();
	
	class CreditCardNumberValidator implements Validator {

		@Override
		public void validate(String input) {
			if(input.matches("\\d{16}")) {
			}
		}
	}
	
	CreditCardNumberValidator crediCardValidate = new CreditCardNumberValidator();
	
	class IpVersion4Validator implements Validator {

		@Override
		public void validate(String input) {
			if(input.matches("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.)"
					+ "{3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$")) {
			}
		}
		
	}
	
	IpVersion4Validator ipV4Validate = new IpVersion4Validator();

	public static void main(String[] args) {
		UserInputChecker check = new UserInputChecker();
		Scanner in = new Scanner(System.in);
		int i = 0;
		while(2-i == 0) {
			in.nextLine();
			String s = in.nextLine();
			System.out.println(s);
			check.nameValidate.validate(s);
			i++;
		}
		in.close();
	}



}
