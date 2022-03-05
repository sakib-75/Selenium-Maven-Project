package test_case_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver_package.BaseDriver;
import utilities_package.WarningMessage;

public class TC002 extends BaseDriver implements WarningMessage{
	
	@Test
	public void signup() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement userName = driver.findElement(By.id("inputUsername"));
		userName.sendKeys("sakib");
		
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("inputPassword"));
		password.sendKeys("1234");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[normalize-space()='Sign In'])[1]")).click();
		
		Thread.sleep(2000);
		warningMessage(driver, "* Incorrect username or password");
		

	}

}
