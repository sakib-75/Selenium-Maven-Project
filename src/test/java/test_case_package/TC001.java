package test_case_package;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driver_package.BaseDriver;

public class TC001 extends BaseDriver{
	
	String baseUrl = "https://rahulshettyacademy.com/locatorspractice/";
	
	@Test
	public void locator() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		
		Thread.sleep(2000);
	}

}
