package action_test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver_package.BaseDriver;
import page_object_model.FramePOM;

public class Frame extends BaseDriver {

	@Test
	public void frame() {

		FramePOM pom = new FramePOM(driver);
		driver.get("https://jqueryui.com/droppable");

		System.out.println("Total frame: " + pom.allFrame().size());

		WebElement frame = pom.demoFrame();
		driver.switchTo().frame(frame);

		WebElement source = pom.sourceElement();
		WebElement target = pom.targetElement();

		actions.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();

	}
	
}
