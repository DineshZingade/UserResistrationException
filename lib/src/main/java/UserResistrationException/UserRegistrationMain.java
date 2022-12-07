package UserResistrationException;

import java.util.Scanner;

public class UserRegistrationMain {
	public static void main(String[] args) throws InvalidUserDetailsException {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Enter the options:\n1. Validate First Name\n2. Validate Last Name\n3. Validate Email ID\n4. Validate Mobile Number\n5. Validate Password Rule1\n6. Validate Password Rule2\n7. Validate Password Rule3\n8. Validate Password Rule4");
		switch (scanner.nextInt()) {
		case 1:
			UserRegistration.validFirstName("Dinesh");
			break;
		case 2:
			UserRegistration.validLastName("Zingade");
			break;
		case 3:
			UserRegistration.validEmail("abc.xyz@bl.co.in");
			break;
		case 4:
			UserRegistration.validMobileNumber("91 9404291279");
			break;
		case 5:
			UserRegistration.validPasswordRule1("Di@ne-sh");
			break;
		case 6:
			UserRegistration.validPasswordRule2("Di@ne-sh_Zingade");
			break;
		case 7:
			UserRegistration.validPasswordRule3("Din@esh12");
			break;
		case 8:
			UserRegistration.validPasswordRule4("Dinesh@12zingade");
			break;
		}
	}

}
