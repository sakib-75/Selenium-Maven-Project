package test_case_package;

import org.testng.annotations.Test;

import driver_package.BaseDriver;

public class TC001 extends BaseDriver{
	
	String baseUrl = "https://rahulshettyacademy.com/locatorspractice/";
	
	@Test
	public void locator() throws InterruptedException {
		
		driver.get(baseUrl);
		Thread.sleep(2000);
	}

}
