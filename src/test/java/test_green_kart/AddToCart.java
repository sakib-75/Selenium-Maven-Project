package test_green_kart;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver_package.BaseDriver;
import page_object_model.TestCases2POM;
import utilities_package.Utilities;

public class AddToCart extends BaseDriver implements Utilities {

	@Test(priority = 1)
	public void addToCart() {

		TestCases2POM pom = new TestCases2POM(driver);
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		implicitWait(driver);

		String[] productNameArr = { "Carrot", "Brocolli", "Cucumber", "Potato" };
		List<String> productNameList = Arrays.asList(productNameArr); // Convert Array to List
		int count = 0;

		List<WebElement> products = pom.allProductTitle();

		for (int i = 0; i < products.size(); i++) {

			String[] productTitle = products.get(i).getText().split("-");
			String productName = productTitle[0].trim();

			if (productNameList.contains(productName)) {
				pom.allAddToCart().get(i).click();

				count++;
				if (count == productNameList.size()) {
					break;
				}
			}
		}

		System.out.println("Total product in cart: " + count);

	}

	@Test(priority = 2)
	public void checkout() throws IOException, InterruptedException {

		TestCases2POM pom = new TestCases2POM(driver);

		pom.cartIcon().click();

		pom.checkOut().click();

		Thread.sleep(1000);

		// String screenshotPath = "C:\\Users\\LENOVO\\Pictures\\screenshot.png";
		// takeScreenshot(driver, screenshotPath);

	}

}
