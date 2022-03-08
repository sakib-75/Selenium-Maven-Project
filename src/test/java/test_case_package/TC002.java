package test_case_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver_package.BaseDriver;
import utilities_package.WarningMessage;

public class TC002 extends BaseDriver implements WarningMessage {

	@Test
	public void signup() throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/locatorspractice");

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement userName = driver.findElement(By.id("inputUsername"));
		userName.sendKeys("sakib");

		WebElement password = driver.findElement(By.name("inputPassword"));
		password.sendKeys("1234");

		driver.findElement(By.xpath("(//button[normalize-space()='Sign In'])[1]")).click();

		String actualMsg = driver.findElement(By.cssSelector("p.error")).getText();
		String expectedMsg = "* Incorrect username or password";

		warningMessage(actualMsg, expectedMsg);

	}

}
