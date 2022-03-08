package test_case_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driver_package.BaseDriver;
import utilities_package.WarningMessage;

public class TC001 extends BaseDriver implements WarningMessage {

	@Test(priority = 0)
	public void TC001_1() throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/locatorspractice");

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();

		String actualMsg = driver.findElement(By.cssSelector("p.error")).getText();
		String expectedMsg = "* Incorrect username or password";

		warningMessage(actualMsg, expectedMsg);

	}

	@Test(priority = 1)
	public void TC001_2() throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.navigate().refresh();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();

		driver.findElement(By.id("chkboxTwo")).click();

		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();

		String actualMsg = driver.findElement(By.cssSelector("p.error")).getText();
		String expectedMsg = "* Incorrect username or password";

		warningMessage(actualMsg, expectedMsg);

	}

}
