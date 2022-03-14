package page_object_model;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePOM {

	WebDriver driver;

	public FramePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(tagName = "iframe")
	List<WebElement> allFrame;

	@FindBy(className = "demo-frame")
	WebElement demoFrame;

	@FindBy(id = "draggable")
	WebElement sourceElement;

	@FindBy(id = "droppable")
	WebElement targetElement;

	public List<WebElement> allFrame() {
		return allFrame;
	}

	public WebElement demoFrame() {
		return demoFrame;
	}

	public WebElement sourceElement() {
		return sourceElement;
	}

	public WebElement targetElement() {
		return targetElement;
	}

}
