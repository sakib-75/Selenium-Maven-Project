package page_object_model;

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

	@FindBy(css = "h4.product-name")
	WebElement allProductTitle;

	@FindBy(xpath = "//div[@class='product-action']")
	WebElement allAddToCart;

	@FindBy(xpath = "//a[@class='cart-icon']")
	WebElement cartIcon;

	@FindBy(xpath = "//button[text()='PROCEED TO CHECKOUT']")
	WebElement checkOut;

	public WebElement allProductTitle() {
		return allProductTitle;
	}

	public WebElement allAddToCart() {
		return allAddToCart;
	}

	public WebElement cartIcon() {
		return cartIcon;
	}

	public WebElement checkOut() {
		return checkOut;
	}

}
