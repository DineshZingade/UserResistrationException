package UserResistrationException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void givenFirstName_WhenValid_ShouldReturnsTrue() {
		try {
			Assertions.assertTrue(userRegistration.validFirstName("Dinesh"));
			System.out.println("First name is valid");
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid First Name because :- " + e);
		}
	}

	@Test
	public void givenFirstName_WhenInValid_ShouldReturnsFalse() {
		try {
			Assertions.assertTrue(userRegistration.validFirstName("dinesh"));
			System.out.println("First name is valid");
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid First Name because :- " + e);
		}
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnsTrue() {
		try {
			Assertions.assertTrue(userRegistration.validLastName("Zingade"));
			System.out.println("Last name is valid");
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid Last Name because :- " + e);
		}
	}

	@Test
	public void givenLastName_WhenInValid_ShouldReturnsFalse() {
		try {
			Assertions.assertTrue(userRegistration.validLastName("zingade"));
			System.out.println("Last name is valid");
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid Last Name because :- " + e);
		}
	}

	@Test
	public void givenEmail_WhenValid_ShouldReturnsTrue() {
		try {
			Assertions.assertTrue(userRegistration.validEmail("abc.xyz@bl.co.in"));
			System.out.println("Email is valid");
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid Email because :- " + e);
		}
	}

	@Test
	public void givenEmail_WhenInValid_ShouldReturnsFalse() {
		try {
			Assertions.assertTrue(userRegistration.validEmail("din12@gmail.com"));
			System.out.println("Email is valid");
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid Email because :- " + e);
		}
	}

	@Test
	public void givenMobileNo_WhenValid_ShouldReturnsTrue() {
		try {
			Assertions.assertTrue(userRegistration.validMobileNumber("91 9404291279"));
			System.out.println("Mobile Number is valid");
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid Mobile Number because :- " + e);
		}
	}

	@Test
	public void givenMobileNo_WhenInValid_ShouldReturnsFalse() {
		try {
			Assertions.assertTrue(userRegistration.validMobileNumber("9404291279"));
			System.out.println("Mobile Number is valid");
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid Mobile Number because :- " + e);
		}
	}

	@Test
	public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() {
		try {
			Assertions.assertTrue(userRegistration.validPasswordRule1("di@ne-sh"));
			System.out.println("Password Rule1 is valid");
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid Password Rule1 because :- " + e);
		}
	}

	@Test
	public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() {
		try {
			Assertions.assertTrue(userRegistration.validPasswordRule1("dinesh"));
			System.out.println("Password Rule1 is valid");
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid Password Rule1 because :- " + e);
		}
	}

	@Test
	public void givenPasswordRule2_WhenValid_ShouldReturnsTrue() {
		try {
			Assertions.assertTrue(userRegistration.validPasswordRule2("Di@ne-sh_Zingade"));
			System.out.println("Password Rule2 is valid");
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid Password Rule2 because :- " + e);
		}
	}

	@Test
	public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() {
		try {
			Assertions.assertTrue(userRegistration.validPasswordRule2("din-esh.zin"));
			System.out.println("Password Rule2 is valid");
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid Password Rule2 because :- " + e);
		}
	}

	@Test
	public void givenPasswordRule3_WhenValid_ShouldReturnsTrue() {
		try {
			Assertions.assertTrue(userRegistration.validPasswordRule3("Din@esh12"));
			System.out.println("Password Rule3 is valid");
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid Password Rule3 because :- " + e);
		}
	}

	@Test
	public void givenPasswordRule3_WhenInValid_ShouldReturnsFalse() {
		try {
			Assertions.assertTrue(userRegistration.validPasswordRule3("Din@e.sh"));
			System.out.println("Password Rule3 is valid");
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid Password Rule3 because :- " + e);
		}
	}

	@Test
	public void givenPasswordRule4_WhenValid_ShouldReturnsTrue() {
		try {
			Assertions.assertTrue(userRegistration.validPasswordRule4("Dinesh@12zingade"));
			System.out.println("Password Rule4 is valid");
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid Password Rule4 because :- " + e);
		}
	}

	@Test
	public void givenPasswordRule4_WhenInValid_ShouldReturnsFalse() {
		try {
			Assertions.assertTrue(userRegistration.validPasswordRule4("Din1esh2zingade"));
			System.out.println("Password Rule4 is valid");
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid Password Rule4 because :- " + e);
		}
	}

}
