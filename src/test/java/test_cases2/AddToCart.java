package test_cases2;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver_package.BaseDriver;
import page_object_model.TestCases2POM;
import utilities_package.ImplicitlyWait;
import utilities_package.TakeScreenshot;
import utilities_package.WarningMessage;

public class AddToCart extends BaseDriver implements WarningMessage, ImplicitlyWait, TakeScreenshot {

	@Test(priority = 1)
	public void addToCart() {

		TestCases2POM pom = new TestCases2POM(driver);
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		implicitWait(driver);

		String[] producNametArr = { "Carrot", "Brocolli", "Cucumber", "Potato" };
		List<String> productNameList = Arrays.asList(producNametArr); // Convert Array to List
		int count = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] productTitle = products.get(i).getText().split("-");
			String productName = productTitle[0].trim();

			if (productNameList.contains(productName)) {
				driver.findElements(By.xpath("(//div[@class='product-action'])")).get(i).click();

				count++;
				if (count == productNameList.size()) {
					break;
				}
			}
		}

	}

	@Test(priority = 2)
	public void checkout() throws IOException, InterruptedException {
		
		TestCases2POM pom = new TestCases2POM(driver);
		implicitWait(driver);

		pom.cartIcon().click();

		pom.checkOut().click();
		
		// Thread.sleep(1000);
		// takeScreenshot(driver, "C:\\Users\\LENOVO\\Pictures\\screenshot.png");

	}

}
