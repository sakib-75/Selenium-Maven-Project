package action_test;

import org.testng.annotations.Test;

import driver_package.BaseDriver;
import page_object_model.AlertsHandlingPOM;
import utilities_package.ImplicitlyWait;
import utilities_package.WarningMessage;

public class AlertsHandling extends BaseDriver implements ImplicitlyWait, WarningMessage {

	@Test
	public void alertsHandling() throws InterruptedException {

		AlertsHandlingPOM pom = new AlertsHandlingPOM(driver);
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		implicitWait(driver);

		String nameInpVal = "Sakib";
		pom.nameInp().sendKeys(nameInpVal);

		pom.alertBtn().click();

		Thread.sleep(1000);
		String expAlertMsg = "Hello " + nameInpVal + ", share this practice page and share your knowledge";
		String actAlertMsg = driver.switchTo().alert().getText();
		warningMessage(expAlertMsg, actAlertMsg);

		// Accept alert (ok)
		driver.switchTo().alert().accept();

		pom.confirmBtn().click();

		String expAlertMsg2 = "Hello , Are you sure you want to confirm?";
		String actAlertMsg2 = driver.switchTo().alert().getText();
		warningMessage(expAlertMsg2, actAlertMsg2);

		// Cancel alert
		driver.switchTo().alert().dismiss();

	}

}
