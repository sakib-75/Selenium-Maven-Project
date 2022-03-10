package action_test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driver_package.BaseDriver;
import utilities_package.ImplicitlyWait;
import utilities_package.WarningMessage;

public class AlertsHandling extends BaseDriver implements ImplicitlyWait, WarningMessage {

	@Test
	public void alertsHandling() throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		implicitWait(driver);

		String nameInpVal = "Sakib";
		driver.findElement(By.id("name")).sendKeys(nameInpVal);
		driver.findElement(By.id("alertbtn")).click();

		Thread.sleep(1000);
		String expAlertMsg = "Hello " + nameInpVal + ", share this practice page and share your knowledge";
		String actAlertMsg = driver.switchTo().alert().getText();
		warningMessage(expAlertMsg, actAlertMsg);

		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();

		String expAlertMsg2 = "Hello , Are you sure you want to confirm?";
		String actAlertMsg2 = driver.switchTo().alert().getText();
		warningMessage(expAlertMsg2, actAlertMsg2);

		driver.switchTo().alert().dismiss();

	}

}
