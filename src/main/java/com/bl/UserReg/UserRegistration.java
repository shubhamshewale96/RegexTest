package com.bl.UserReg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public boolean firstName(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	public boolean lastName(String lastName) {
		// TODO Auto-generated method stub
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}

	public boolean email(String email) {
		// TODO Auto-generated method stub
		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}?(.[a-z]{2,3}){0,1}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	/**
	 * Created a method to validate Mobile Number Format
	 */
	public boolean phoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phoneNumber);
		return matcher.matches();
	}
	/**
	 * Created a method to validate password with minimum 8 character
	 */
	public boolean password(String password) {
		// TODO Auto-generated method stub
		 String regex = "^[0-9a-zA-Z!,@#$&*().]{8,}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(password);
	        return matcher.matches();
	}
}
