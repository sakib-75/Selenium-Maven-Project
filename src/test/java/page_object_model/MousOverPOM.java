package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class MousOverPOM {

	WebDriver driver;

	public MousOverPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='cb-hm-text'])[1]")
	WebElement homeLogo;

	@FindBy(id = "teamDropDown")
	WebElement teamDropDown;

	@FindBy(xpath = "//a[normalize-space()='Bangladesh']")
	WebElement teamBD;

	@FindBy(xpath = "//a[@title='Bangladesh Cricket Team Schedule']")
	WebElement teamSchedule;

	@FindBy(id = "search_bar_menu")
	WebElement searchInp;

	@FindBys({ 
		@FindBy(xpath = "//span[@ng-bind='result.title']"), 
		@FindBy(xpath = "//span[@class='ng-binding']"),
		@FindBy(xpath = "//span[normalize-space()='Shakib Al Hasan']") 
	})
	WebElement sahSearch;

	public WebElement homeLogo() {
		return homeLogo;
	}

	public WebElement teamDropDown() {
		return teamDropDown;
	}

	public WebElement teamBD() {
		return teamBD;
	}

	public WebElement teamSchedule() {
		return teamSchedule;
	}

	public WebElement searchInp() {
		return searchInp;
	}

	public WebElement sahSearch() {
		return sahSearch;
	}

}
