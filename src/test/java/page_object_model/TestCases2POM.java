package page_object_model;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCases2POM {

	WebDriver driver;

	public TestCases2POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Home page
	@FindBy(css = "h4.product-name")
	List<WebElement> allProductTitle;

	@FindBy(xpath = "//div[@class='product-action']")
	List<WebElement> allAddToCart;

	@FindBy(xpath = "//a[@class='cart-icon']")
	WebElement cartIcon;

	@FindBy(xpath = "//button[text()='PROCEED TO CHECKOUT']")
	WebElement checkOut;

	public List<WebElement> allProductTitle() {
		return allProductTitle;
	}

	public List<WebElement> allAddToCart() {
		return allAddToCart;
	}

	public WebElement cartIcon() {
		return cartIcon;
	}

	public WebElement checkOut() {
		return checkOut;
	}

}
