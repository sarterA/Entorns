package com.company.Refactoritzacions_8.Introduce_foreign_method;

public class PasswordChecker {

	public static String improvePassword (String password) {
		if (password.length() < 5) {
			return makeItPalindrome(password);
		} else {
			return password;
		}
	}

	public static String makeItPalindrome(String password) {
		return new String(password + new StringBuilder(password).reverse().toString());
	}

}
