package test_cases2;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import page_object_model.TestCases2POM;

public class PlaceOrder extends AddToCart {

	@Test(priority = 6)
	public void placeOrder() throws InterruptedException {

		TestCases2POM pom = new TestCases2POM(driver);

		pom.placeOrderBtn().click();

		Select country = new Select(pom.countrySelect());
		country.selectByValue("Bangladesh");

		pom.checkAgree().click();

		pom.proceedBtn().click();
		
		Thread.sleep(1000);

	}

}
