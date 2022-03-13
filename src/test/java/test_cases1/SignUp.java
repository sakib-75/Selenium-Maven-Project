package test_cases1;

import org.testng.annotations.Test;

import driver_package.BaseDriver;
import page_object_model.LocatorsPracticePOM;
import utilities_package.ImplicitlyWait;
import utilities_package.WarningMessage;

public class SignUp extends BaseDriver implements WarningMessage, ImplicitlyWait {

	@Test
	public void TC03() {

		LocatorsPracticePOM lp = new LocatorsPracticePOM(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		implicitWait(driver);

		lp.userNameInp().sendKeys("sakib");

		lp.passwordInp().sendKeys("123");

		lp.signInBtn().click();

		String actualMsg = lp.errorMsg().getText();
		String expectedMsg = "* Incorrect username or password";

		warningMessage(actualMsg, expectedMsg);

	}

}
