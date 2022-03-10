package test_case_package2;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver_package.BaseDriver;
import utilities_package.ImplicitlyWait;
import utilities_package.TakeScreenshot;
import utilities_package.WarningMessage;

public class TC001 extends BaseDriver implements WarningMessage, ImplicitlyWait, TakeScreenshot {

	@Test(priority = 0)
	public void addToCart() {

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

	@Test(priority = 1)
	public void checkout() throws IOException, InterruptedException {
		
		implicitWait(driver);

		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();

		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		//Thread.sleep(1000);
		//takeScreenshot(driver, "C:\\Users\\LENOVO\\Pictures\\screenshot.png");

	}

}
