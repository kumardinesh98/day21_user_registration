package user_reg;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PUserRegistration {
	
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String emailId;
	private String password;

	private boolean expectedFirstName;
	private boolean expectedLastName;
	private boolean expectedForNumber;
	private boolean expectedForEmail;
	private boolean expecteForPassword;
	
	private UserRegistration userRegistration ;
	

	public PUserRegistration(String firstName, String lastName, String contactNumber, String emailId,
			String password, boolean expectedFirstName, boolean expectedLastName, boolean expectedForNumber,
			boolean expectedForEmail, boolean expecteForPassword) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.password = password;
		this.expectedFirstName = expectedFirstName;
		this.expectedLastName = expectedLastName;
		this.expectedForNumber = expectedForNumber;
		this.expectedForEmail = expectedForEmail;
		this.expecteForPassword = expecteForPassword;
	}


	@Before
	public void initialize() {
		userRegistration = new UserRegistration();
	}
	

	@Parameterized.Parameters
	public static Collection parameter() {
		return Arrays.asList(new Object[][] { { "", "", "", "","",false, false, false, false, false },
				{ "Dinesh", "Kumar", "91 7200762705", "abc.xyz@bl.co.in", "Dinesh1@",true,true, true, true, true } });
	}
	 
	
	@Test
	public void firstNmaeTest() {
		assertEquals(expectedFirstName,userRegistration.checkName(firstName));
	}
	

	@Test
	public void lastNameTest() {
		assertEquals(expectedLastName,userRegistration.checkName(lastName));

	}
	
	@Test
	public void number() {
		assertEquals(expectedForNumber,userRegistration.mobileNum(contactNumber));

	}


	@Test
	public void email() {
		assertEquals(expectedForEmail,userRegistration.email(emailId));

	}
	

	@Test
	public void password() {
		assertEquals(expecteForPassword,userRegistration.password(password));

	}
}
