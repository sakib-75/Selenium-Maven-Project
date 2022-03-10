package action_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import driver_package.BaseDriver;

public class MouseOver extends BaseDriver {

	@Test(priority = 0)
	public void hover() throws InterruptedException {

		driver.get("https://www.amazon.com/");
		WebElement el = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));

		actions.moveToElement(el).build().perform();

		Thread.sleep(1000);

	}

	@Test(priority = 1)
	public void inputSearch() throws InterruptedException {

		WebElement inpBox = driver.findElement(By.id("twotabsearchtextbox"));

		actions.moveToElement(inpBox).click().keyDown(Keys.SHIFT).sendKeys("computer").build().perform();

		actions.moveToElement(driver.findElement(By.id("nav-search-submit-button"))).click().build().perform();

		Thread.sleep(2000);

	}

	@Test(priority = 2)
	public void menuHover() throws InterruptedException {

		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://www.daraz.com.bd/");

		WebElement menuItem1 = driver.findElement(By.xpath("(//a)[21]"));
		actions.moveToElement(menuItem1).build().perform();

		WebElement menuItem2 = driver.findElement(By.xpath("(//a)[51]"));
		actions.moveToElement(menuItem2).click().build().perform();

	}

}
