package test_cases2;

import org.testng.annotations.Test;

import page_object_model.TestCases2POM;

public class PromoCode extends AddToCart {

	@Test(priority = 3)
	public void promoCodeEmpty() throws InterruptedException {

		TestCases2POM pom = new TestCases2POM(driver);

		pom.promoCodeApply().click();

		String actualMsg = pom.promoInfo().getText();
		String expectedMsg = "Empty code ..!";

		warningMessage(actualMsg, expectedMsg);
		Thread.sleep(1000);

	}

	@Test(priority = 4)
	public void promoCodeWrong() {

		TestCases2POM pom = new TestCases2POM(driver);
		driver.navigate().refresh();

		pom.promoCodeInp().sendKeys("abc123");

		pom.promoCodeApply().click();

		String actualMsg = pom.promoInfo().getText();
		String expectedMsg = "Invalid code ..!";

		warningMessage(actualMsg, expectedMsg);

	}

	@Test(priority = 5)
	public void promoCodeRight() {

		TestCases2POM pom = new TestCases2POM(driver);
		driver.navigate().refresh();

		pom.promoCodeInp().sendKeys("rahulshettyacademy");

		pom.promoCodeApply().click();

		String actualMsg = pom.promoInfo().getText();
		String expectedMsg = "Code applied ..!";

		warningMessage(actualMsg, expectedMsg);

	}

}
