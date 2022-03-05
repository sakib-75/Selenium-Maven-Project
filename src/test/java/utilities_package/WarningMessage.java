package utilities_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public interface WarningMessage {
	
	default void warningMessage(WebDriver driver, String msg) {

		String actualMessage = driver.findElement(By.cssSelector("p.error")).getText();
		String expectedMessage = msg;
		
		System.out.println("Actual Message: " + actualMessage);
		System.out.println("Expected Message: " + expectedMessage);

		Assert.assertEquals(actualMessage, expectedMessage);

	}

}
