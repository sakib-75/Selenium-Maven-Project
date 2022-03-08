package utilities_package;

import org.testng.Assert;

public interface WarningMessage {

	default void warningMessage(String aMsg, String eMsg) {

		String actualMessage = aMsg;
		String expectedMessage = eMsg;

		System.out.println("Actual Message: " + actualMessage);
		System.out.println("Expected Message: " + expectedMessage);

		Assert.assertEquals(actualMessage, expectedMessage);

	}

}
