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
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Forgot your password?"))).click();
		
		WebElement nameInp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Name']")));
		nameInp.sendKeys("Sakibul Islam");
		
		WebElement emailInp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Email']")));
		emailInp.sendKeys("sakibulislam285@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement phoneInp = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
		phoneInp.sendKeys("01914603437");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("go-to-login-btn")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.cssSelector("input#inputUsername"));
		username.sendKeys("sakib");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		password.sendKeys("rahulshettyacademy");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		
		
		
		
	}

}
