package action_test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import driver_package.BaseDriver;
import page_object_model.MousOverPOM;
import utilities_package.Utilities;

public class MouseOver extends BaseDriver implements Utilities {

	@Test(priority = 1)
	public void teamSchedule() throws InterruptedException {

		MousOverPOM pom = new MousOverPOM(driver);
		driver.get("https://www.cricbuzz.com");
		implicitWait(driver);

		WebElement el = pom.teamDropDown();
		actions.moveToElement(el).build().perform();

		actions.moveToElement(pom.teamBD()).click().build().perform();

		actions.moveToElement(pom.teamSchedule()).click().build().perform();

		Thread.sleep(1000);

	}

	@Test(priority = 2)
	public void search() throws InterruptedException {

		MousOverPOM pom = new MousOverPOM(driver);
		pom.homeLogo().click();

		Actions search = actions.moveToElement(pom.searchInp()).click().sendKeys("shakib");
		search.sendKeys(Keys.ENTER).build().perform();

		pom.sahSearch().click();

		Thread.sleep(2000);

	}

}
