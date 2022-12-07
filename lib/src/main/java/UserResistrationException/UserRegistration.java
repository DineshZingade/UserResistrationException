package UserResistrationException;

import java.util.regex.Pattern;

import org.hamcrest.Matcher;

public class UserRegistration {
	public static boolean validFirstName(String name) throws InvalidUserDetailsException {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		java.util.regex.Matcher matcher = pattern.matcher(name);
		boolean result = matcher.matches();
		System.out.println(result);

		if (!result) {
			throw new InvalidUserDetailsException(
					"first Name should start with a Cap and should have minimum 3 characters");
		} else {
			return true;
		}

	}

	public static boolean validLastName(String name) throws InvalidUserDetailsException {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		java.util.regex.Matcher matcher = pattern.matcher(name);
		boolean result = matcher.matches();
		System.out.println(result);

		if (!result) {
			throw new InvalidUserDetailsException("Last Name should start with a Cap and should have minimum 3 chars");
		} else {
			return true;
		}
	}

	public static boolean validEmail(String email) throws InvalidUserDetailsException {

		String regex = "^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$";
		Pattern pattern = Pattern.compile(regex);
		java.util.regex.Matcher matcher = pattern.matcher(email);
		boolean result = matcher.matches();
		System.out.println(result);

		if (!result) {
			throw new InvalidUserDetailsException("Enter a valid email address");
		} else {
			return true;
		}
	}

	public static boolean validMobileNumber(String mobileNo) throws InvalidUserDetailsException {
		String regex = "^[\\d]{2}\\s[\\d]{10}$";
		Pattern pattern = Pattern.compile(regex);
		java.util.regex.Matcher matcher = pattern.matcher(mobileNo);
		boolean result = matcher.matches();
		System.out.println(result);

		if (!result) {
			throw new InvalidUserDetailsException("Enter the Valid Mobile number with county code");
		} else {
			return true;
		}
	}

	public static boolean validPasswordRule1(String passwordRule1) throws InvalidUserDetailsException {
		String regex = "^[A-Za-z0-9@._-]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		java.util.regex.Matcher matcher = pattern.matcher(passwordRule1);
		boolean result = matcher.matches();
		System.out.println(result);

		if (!result) {
			throw new InvalidUserDetailsException("Password must have 8 character");
		} else {
			return true;
		}
	}

	public static boolean validPasswordRule2(String passwordRule2) throws InvalidUserDetailsException {
		String regex = "^[A-Z]{1}[A-Za-z0-9@._-]{7,}$";
		Pattern pattern = Pattern.compile(regex);
		java.util.regex.Matcher matcher = pattern.matcher(passwordRule2);
		boolean result = matcher.matches();
		System.out.println(result);

		if (!result) {
			throw new InvalidUserDetailsException("Password must have atleast one uppercase letter");
		} else {
			return true;
		}
	}

	public static boolean validPasswordRule3(String passwordRule3) throws InvalidUserDetailsException {
		String regex = "^(?=.*[A-z])(?=.*[0-9])([a-zA-Z0-9@._-]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		java.util.regex.Matcher matcher = pattern.matcher(passwordRule3);
		boolean result = matcher.matches();
		System.out.println(result);

		if (!result) {
			throw new InvalidUserDetailsException("Password must have atleast one numeric number");
		} else {
			return true;
		}
	}

	public static boolean validPasswordRule4(String passwordRule4) throws InvalidUserDetailsException {
		String regex = "^(?=.*[A-z])(?=.*[0-9])(?=.*[@#$%^&*()-+=])([a-zA-Z0-9@._-]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		java.util.regex.Matcher matcher = pattern.matcher(passwordRule4);
		boolean result = matcher.matches();
		System.out.println(result);

		if (!result) {
			throw new InvalidUserDetailsException("Password must has exactly one special character");
		} else {
			return true;
		}
	}

}
