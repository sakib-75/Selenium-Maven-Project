package test_locatorspractice;

import org.testng.annotations.Test;

import driver_package.BaseDriver;
import page_object_model.LocatorsPracticePOM;
import utilities_package.Utilities;

public class EmptyInput extends BaseDriver implements Utilities {

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

		lp.checkBox1().click();

		lp.checkBox2().click();

		lp.signInBtn().click();

		String actualMsg = lp.errorMsg().getText();
		String expectedMsg = "* Incorrect username or password";

		warningMessage(actualMsg, expectedMsg);

	}

}
