package action_test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driver_package.BaseDriver;
import utilities_package.ImplicitlyWait;

public class WindowsHandling extends BaseDriver implements ImplicitlyWait {

	@Test
	public void window() throws InterruptedException {

		driver.get("https://sakibul-islam.netlify.app");
		implicitWait(driver);
		
		driver.findElement(By.xpath("//section[@id='about']//div[3]//a[1]")).click();
		driver.findElement(By.xpath("//section[@id='about']//div[4]//a[1]")).click();
		System.out.println(driver.getTitle());
		
		Set<String> tab = driver.getWindowHandles();
		Iterator<String> itr = tab.iterator();
		
		String parTab = itr.next();
		String chTab1 = itr.next();
		String chTab2 = itr.next();
		
		driver.switchTo().window(chTab1);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(chTab2);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parTab);
		System.out.println(driver.getTitle());
	

	}

}
