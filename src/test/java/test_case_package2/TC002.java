package test_case_package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC002 extends TC001 {

	@Test(priority = 2)
	public void promoCodeEmpty() throws InterruptedException {
		
		implicitWait(driver);

		driver.findElement(By.className("promoBtn")).click();

		String actualMsg = driver.findElement(By.cssSelector("span.promoInfo")).getText();
		String expectedMsg = "Empty code ..!";

		warningMessage(actualMsg, expectedMsg);
		Thread.sleep(2000);

	}

	@Test(priority = 3)
	public void promoCodeWrong() {
		
		implicitWait(driver);
		driver.navigate().refresh();

		WebElement promocodeInp = driver.findElement(By.className("promoCode"));
		promocodeInp.sendKeys("abc123");

		driver.findElement(By.className("promoBtn")).click();

		String actualMsg = driver.findElement(By.cssSelector("span.promoInfo")).getText();
		String expectedMsg = "Invalid code ..!";

		warningMessage(actualMsg, expectedMsg);

	}

	@Test(priority = 4)
	public void promoCodeRight() {
		
		implicitWait(driver);
		driver.navigate().refresh();

		WebElement promocodeInp = driver.findElement(By.className("promoCode"));
		promocodeInp.sendKeys("rahulshettyacademy");

		driver.findElement(By.className("promoBtn")).click();

		String actualMsg = driver.findElement(By.cssSelector("span.promoInfo")).getText();
		String expectedMsg = "Code applied ..!";

		warningMessage(actualMsg, expectedMsg);

	}

}
