package com.bridgelabz.user_registration_problem_and_custom_exception;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNameException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first name : ");
		try {
			String namePattern = "^[A-Z]{1}[a-z]{3,9}$";
			Pattern regex = Pattern.compile(namePattern);
			String inputStr = sc.nextLine();
			char val = inputStr.charAt(20);
			Matcher firstNameMatcher = regex.matcher(inputStr);
			sc.close();
			System.out.print(val);

			if (firstNameMatcher.matches()) {
				System.out.println(inputStr + "\nis valid name.");
			} else {
				System.out.println(inputStr + "\nis invalid name.Kindly input the right one.");
			}
		}

		catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		}
	}
}
