package test_case_package2;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver_package.BaseDriver;
import utilities_package.WarningMessage;

public class TC001 extends BaseDriver implements WarningMessage {

	@Test(priority = 0)
	public void addToCart() {

		driver.get("https://rahulshettyacademy.com/seleniumPractise");

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

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
	public void checkout() {

		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();

		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

	}

	@Test(priority = 2)
	public void promoCodeEmpty() throws InterruptedException {

		driver.findElement(By.className("promoBtn")).click();

		String actualMsg = driver.findElement(By.cssSelector("span.promoInfo")).getText();
		String expectedMsg = "Empty code ..!";

		warningMessage(actualMsg, expectedMsg);
		Thread.sleep(2000);

	}

	@Test(priority = 3)
	public void promoCodeWrong() {

		driver.navigate().refresh();

		WebElement promocodeInp = driver.findElement(By.className("promoCode"));
		promocodeInp.sendKeys("abc123");

		driver.findElement(By.className("promoBtn")).click();

		String actualMsg = driver.findElement(By.cssSelector("span.promoInfo")).getText();
		String expectedMsg = "Invalid code ..!";

		warningMessage(actualMsg, expectedMsg);

	}

	@Test(priority = 4)
	public void placeOrder() {

	}

}
