package test_case_package;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import driver_package.BaseDriver;

public class TC001 extends BaseDriver{
	
	@Test(priority = 0)
	public void TC001_1() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		
		Thread.sleep(2000);
		String actualMessage = driver.findElement(By.cssSelector("p.error")).getText();
		String expectedMessage = "* Incorrect username or password";
		System.out.println(actualMessage);
		
		Assert.assertEquals(actualMessage, expectedMessage);
			
	}
	
	
	@Test(priority = 1)
	public void TC001_2() throws InterruptedException {
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("chkboxTwo")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		
		Thread.sleep(2000);
		
	}

}
