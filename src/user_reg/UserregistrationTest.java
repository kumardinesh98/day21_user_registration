package user_reg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserregistrationTest {
	@Test
	public void testName() {
		UserRegistration userRegistration = new UserRegistration();
		assertEquals("fine", userRegistration.checkName("Dinesh"));
		assertEquals("invalid", userRegistration.checkName("dinesh"));
		
		assertEquals("fine", userRegistration.checkName("Kumar"));
		assertEquals("invalid", userRegistration.checkName("Ku"));
		
		assertEquals("fine", userRegistration.email("Dinesh"));
		
	}
}
