package test_case_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driver_package.BaseDriver;

public class TC003 extends BaseDriver{
	
	@Test
	public void tc003() throws InterruptedException {
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		WebElement nameInp = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		nameInp.sendKeys("Sakibul Islam");
		
		WebElement emailInp = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		emailInp.sendKeys("sakibulislam285@gmail.com");

		WebElement phoneInp = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
		phoneInp.sendKeys("01914603437");
		
		WebElement resetBtn = wait.until(ExpectedConditions.elementToBeClickable(By.className("reset-pwd-btn")));
		resetBtn.click();
		
		driver.findElement(By.className("go-to-login-btn")).click();

		WebElement username = driver.findElement(By.cssSelector("input#inputUsername"));
		username.sendKeys("sakib");
		
		WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		password.sendKeys("rahulshettyacademy");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();

	
		
	}

}
