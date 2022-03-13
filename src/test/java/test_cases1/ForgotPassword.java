package test_cases1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driver_package.BaseDriver;
import page_object_model.LocatorsPracticePOM;
import utilities_package.ImplicitlyWait;

public class ForgotPassword extends BaseDriver implements ImplicitlyWait {

	@Test
	public void TC04() throws InterruptedException {

		LocatorsPracticePOM lp = new LocatorsPracticePOM(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		implicitWait(driver);

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		lp.forgotPassLink().click();
		
		lp.nameInp().sendKeys("Sakibul Islam");
		
		lp.emailInp().sendKeys("sakib75.cse@gmail.com");
		
		lp.phoneInp().sendKeys("01914603437");
		
		WebElement resetBtn = wait.until(ExpectedConditions.elementToBeClickable(By.className("reset-pwd-btn")));
		resetBtn.click();
		
		lp.goToLoginBtn().click();
		
		lp.userNameInp().sendKeys("sakib");
		
		lp.passwordInp().sendKeys("123");
		
		Thread.sleep(1000);
		lp.signInBtn().click();
		
		

	}

}
