package user_reg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.password();
		userRegistration.mobileNum();
		Scanner scanner = new Scanner(System.in);
		userRegistration.checkName("Abcde");
		userRegistration.checkName("Fghij");
		userRegistration.email("hbbggb");
	}
	
	public void password() {
		System.out.println("enter password");
		String password = scanner.nextLine();
		String validPassword = "^.*(?=.{8})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]{1}).*$";
		Pattern compiledPassword = Pattern.compile(validPassword);
		Matcher pinmatcher = compiledPassword.matcher(password);
		if (pinmatcher.matches()) {
			System.out.println(password + " is fine");
		} else {
			System.out.println(password + " not valid");
		}
	}
	public String email(String emailId) {
		String validEmail = "^abc+.[a-z]*[@bl.co]+[.a-z]*";
		Pattern compiledName = Pattern.compile(validEmail);
		Matcher pinmatcher = compiledName.matcher(emailId);
		if (pinmatcher.matches()) {
			return "fine";
		} else {
			return "invalid";
		}
	}
	
	public void mobileNum() {
		System.out.println("enter mobile number");
		String mobileNumber = scanner.nextLine();
		String validNumber = "[91]+\s[0-9]{10}";
		Pattern compiledName = Pattern.compile(validNumber);
		Matcher pinmatcher = compiledName.matcher(mobileNumber);
		if (pinmatcher.matches()) {
			System.out.println(mobileNumber + " is fine");
		} else {
			System.out.println(mobileNumber + " not valid");
		}
	}
	
	public String checkName(String name) {
		String validName ="^[A-Z]+[a-z]{3,}";
		Pattern compiledName = Pattern.compile(validName);
		Matcher pinmatcher = compiledName.matcher(name);
		if (pinmatcher.matches()) {
			return "fine";
		} else {
			return "invalid";
		}
	}
}

