package com.bl.UserReg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bl.UserReg.UserValidationException.ExceptionType;
@FunctionalInterface
interface UserDetailsValidationIF {
	boolean validate(String input) throws UserValidationException;
}
public class UserRegistration {
	UserDetailsValidationIF validateFirstName = firstName -> {

		try {
			if (firstName.length() == 0) {
				throw new UserValidationException(ExceptionType.ENTERED_EMPTY, "Please Enter Valid Name");
			}
			String regex = "^[A-Z]{1}[a-z]{2,}$";
			return firstName.matches(regex);

		} catch (NullPointerException e) {
			throw new UserValidationException(ExceptionType.ENTERED_NULL,
					"Please Enter Valid Name. NULL Name Entered.");
		}
	};

	/*
	 * public boolean firstName(String firstName) { String regex
	 * ="^[A-Z]{1}[a-z]{2,}$"; Pattern pattern = Pattern.compile(regex); Matcher
	 * matcher = pattern.matcher(firstName); return matcher.matches(); }
	 */

	UserDetailsValidationIF validateLastName = lastName -> {

		try {
			if (lastName.length() == 0) {
				throw new UserValidationException(ExceptionType.ENTERED_EMPTY, "Please Enter Valid Name");
			}
			String regex = "^[A-Z]{1}[a-z]{2,}$";
			return lastName.matches(regex);

		} catch (NullPointerException e) {
			throw new UserValidationException(ExceptionType.ENTERED_NULL,
					"Please Enter Valid Name. NULL Name Entered.");
		}
	};

	/*
	 * public boolean lastName(String lastName) { // TODO Auto-generated method stub
	 * String regex = "^[A-Z]{1}[a-z]{2,}$"; Pattern pattern =
	 * Pattern.compile(regex); Matcher matcher = pattern.matcher(lastName); return
	 * matcher.matches(); }
	 */

	UserDetailsValidationIF validateEmail = email -> {

		try {
			if (email.length() == 0) {
				throw new UserValidationException(ExceptionType.ENTERED_EMPTY, "Please Enter Valid Email");
			}
			String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}?(.[a-z]{2,3}){0,1}$";
			return email.matches(regex);

		} catch (NullPointerException e) {
			throw new UserValidationException(ExceptionType.ENTERED_NULL, "Please Enter Valid email. NULL Entered.");
		}
	};
	/*
	 * public boolean email(String email) { // TODO Auto-generated method stub
	 * String regex =
	 * "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}?(.[a-z]{2,3}){0,1}$";
	 * Pattern pattern = Pattern.compile(regex); Matcher matcher =
	 * pattern.matcher(email); return matcher.matches(); }
	 */

	/**
	 * Created a method to validate Mobile Number Format
	 */

	UserDetailsValidationIF validateMobileNumber = phoneNumber -> {

		try {
			if (phoneNumber.length() == 0) {
				throw new UserValidationException(ExceptionType.ENTERED_EMPTY, "Please Enter Valid phonenumber");
			}
			String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
			return phoneNumber.matches(regex);

		} catch (NullPointerException e) {
			throw new UserValidationException(ExceptionType.ENTERED_NULL,
					"Please Enter Valid phonenumber. NULL Entered.");
		}
	};
	/*
	 * public boolean phoneNumber(String phoneNumber) { // TODO Auto-generated
	 * method stub String regex = "^[0-9]{2}\\s{1}[0-9]{10}$"; Pattern pattern =
	 * Pattern.compile(regex); Matcher matcher = pattern.matcher(phoneNumber);
	 * return matcher.matches(); }
	 */

	/**
	 * Created a method to validate password with minimum 8 character
	 */

	UserDetailsValidationIF validatePassword = password -> {

		try {
			if (password.length() == 0) {
				throw new UserValidationException(ExceptionType.ENTERED_EMPTY, "Please Enter Valid password");
			}
			String regex = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%!]).{8,}$";
			return password.matches(regex);

		} catch (NullPointerException e) {
			throw new UserValidationException(ExceptionType.ENTERED_NULL, "Please Enter Valid password. NULL Entered.");
		}
	};
	/*
	 * public boolean password(String password) { // TODO Auto-generated method stub
	 * String regex = "^[0-9a-zA-Z!,@#$&*().]{8,}$"; Pattern pattern =
	 * Pattern.compile(regex); Matcher matcher = pattern.matcher(password); return
	 * matcher.matches(); }
	 */
	/*
		*//**
			 * Created a method to validate password with atLeast one upper case
			 */
	/*
	 * public boolean passwordRule2(String password) { String regex =
	 * "^(?=.*[A-Z]){1}(?=.*[a-z]).{8,}$"; Pattern pattern = Pattern.compile(regex);
	 * Matcher matcher = pattern.matcher(password); return matcher.matches(); }
	 * 
	 *//**
		 * Created a method to validate password with atLeast one numeric value
		 */
	/*
	 * public boolean passwordRule3(String password) { String regex =
	 * "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9]).{8,}$"; Pattern pattern =
	 * Pattern.compile(regex); Matcher matcher = pattern.matcher(password); return
	 * matcher.matches(); }
	 * 
	 *//**
		 * Created a method to validate password with exactly one special character
		 *//*
			 * public boolean passwordRule4(String password) { String regex =
			 * "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%!]).{8,}$"; Pattern pattern =
			 * Pattern.compile(regex); Matcher matcher = pattern.matcher(password); return
			 * matcher.matches(); }
			 */

	/**
	 * Created a method to validate email
	 */
	public boolean emailIdValidator(String emailId) {
		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailId);
		return matcher.matches();
	}
	
}
