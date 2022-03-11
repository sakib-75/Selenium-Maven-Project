package action_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver_package.BaseDriver;

public class Frame extends BaseDriver {

	@Test
	public void frame() {

		driver.get("https://jqueryui.com/droppable");

		System.out.println("Total frame: " + driver.findElements(By.tagName("iframe")).size());

		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		actions.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();

	}
	
}
