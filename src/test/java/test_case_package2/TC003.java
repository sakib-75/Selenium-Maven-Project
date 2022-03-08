package test_case_package2;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC003 extends TC001 {

	@Test(priority = 2)
	public void placeOrder() {

		implicitWait(driver);

		driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();

		Select country = new Select(driver.findElement(By.xpath("(//select)[1]")));
		country.selectByValue("Bangladesh");

		driver.findElement(By.className("chkAgree")).click();

		driver.findElement(By.xpath("//button[normalize-space()='Proceed']")).click();

	}

}
