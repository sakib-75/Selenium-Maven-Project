package test_case_package2;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver_package.BaseDriver;

public class TC001 extends BaseDriver {

	@Test
	public void flights() throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/seleniumPractise");

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String[] producNametArr = { "Carrot", "Brocolli", "Cucumber", "Beetroot" };
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

		Thread.sleep(5000);

	}

}
