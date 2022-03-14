package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsHandlingPOM {

	WebDriver driver;

	public AlertsHandlingPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "name")
	WebElement nameInp;

	@FindBy(id = "alertbtn")
	WebElement alertBtn;

	@FindBy(id = "confirmbtn")
	WebElement confirmBtn;

	public WebElement nameInp() {
		return nameInp;
	}

	public WebElement alertBtn() {
		return alertBtn;
	}

	public WebElement confirmBtn() {
		return confirmBtn;
	}

}
