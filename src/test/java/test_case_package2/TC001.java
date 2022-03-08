package test_case_package2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driver_package.BaseDriver;

public class TC001 extends BaseDriver {
	

	@Test
	public void flights() throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise");

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

		
	}

}
