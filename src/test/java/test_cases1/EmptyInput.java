package test_cases1;

import org.testng.annotations.Test;

import driver_package.BaseDriver;
import page_object_model.LocatorsPracticePOM;
import utilities_package.ImplicitlyWait;
import utilities_package.WarningMessage;

public class EmptyInput extends BaseDriver implements WarningMessage, ImplicitlyWait {

	@Test(priority = 1)
	public void TC01() {

		LocatorsPracticePOM lp = new LocatorsPracticePOM(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		implicitWait(driver);

		lp.signInBtn().click();

		String actualMsg = lp.errorMsg().getText();
		String expectedMsg = "* Incorrect username or password";

		warningMessage(actualMsg, expectedMsg);

	}

	@Test(priority = 2)
	public void TC02() {

		LocatorsPracticePOM lp = new LocatorsPracticePOM(driver);
		driver.navigate().refresh();
		implicitWait(driver);

		lp.checkBox1().click();

		lp.checkBox2().click();

		lp.signInBtn().click();

		String actualMsg = lp.errorMsg().getText();
		String expectedMsg = "* Incorrect username or password";

		warningMessage(actualMsg, expectedMsg);

	}

}
