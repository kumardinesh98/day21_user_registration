package user_reg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		UserRegistration userRegistration = new UserRegistration();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter rthe first name");
		String firstName= scanner.nextLine();
		userRegistration.checkName(firstName);
		
		System.out.println("enter the second name");
		String secondName = scanner.nextLine();
		userRegistration.checkName(secondName);
		
		System.out.println("enter the email id");
		String emailid = scanner.nextLine();
		userRegistration.email(emailid);
		
		System.out.println("enter the mobile number");
		String mobile = scanner.nextLine();
		userRegistration.mobileNum(mobile);

		System.out.println("enter the second name");
		String userPassword = scanner.nextLine();
		userRegistration.password(userPassword);	
	}
	
	public boolean password(String password) {
		
		String validPassword = "^.*(?=.{8})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]{1}).*$";
		Pattern compiledPassword = Pattern.compile(validPassword);
		Matcher pinmatcher = compiledPassword.matcher(password);
		if (pinmatcher.matches()) {
			System.out.println(password + " is fine");
			return true;
		} else {
			System.out.println(password + " not valid");
			return false;
		}
	}
	
	public boolean email(String emailId) {
		
		String validEmail = "^abc+.[a-z]*[@bl.co]+[.a-z]*";
		Pattern compiledName = Pattern.compile(validEmail);
		Matcher pinmatcher = compiledName.matcher(emailId);
		if (pinmatcher.matches()) {
			System.out.println(emailId + " is fine");
			return true;
		} else {
			System.out.println(emailId + " not valid");
			return false;
		}
	}
	
	public boolean mobileNum(String mobileNumber) {
		
		String validNumber = "[91]+\s[0-9]{10}";
		Pattern compiledName = Pattern.compile(validNumber);
		Matcher pinmatcher = compiledName.matcher(mobileNumber);
		if (pinmatcher.matches()) {
			System.out.println(mobileNumber + " is fine");
			return true;
		} else {
			System.out.println(mobileNumber + " not valid");
			return false;
		}
	}

	
	public boolean checkName(String name) {
		String validName ="^[A-Z]+[a-z]{3,}";
		Pattern compiledName = Pattern.compile(validName);
		Matcher pinmatcher = compiledName.matcher(name);
		if (pinmatcher.matches()) {
			System.out.println(name + " is fine");
			return true;
		} else {
			System.out.println(name + " not valid");
			return false;
		}
	}
}

