package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsPracticePOM {

	WebDriver driver;

	public LocatorsPracticePOM(WebDriver driver) {
		this.driver = driver;
	}

	// SignIn part
	By userNameInp = By.id("inputUsername");
	By passwordInp = By.name("inputPassword");
	By checkBox1 = By.xpath("//input[@id='chkboxOne']");
	By checkBox2 = By.id("chkboxTwo");
	By forgotPassLink = By.linkText("Forgot your password?");
	By signInBtn = By.xpath("//button[text()='Sign In']");
	By errorMsg = By.cssSelector("p.error");

	public WebElement userNameInp() {
		return driver.findElement(userNameInp);
	}

	public WebElement passwordInp() {
		return driver.findElement(passwordInp);
	}

	public WebElement checkBox1() {
		return driver.findElement(checkBox1);
	}

	public WebElement checkBox2() {
		return driver.findElement(checkBox2);
	}

	public WebElement forgotPassLink() {
		return driver.findElement(forgotPassLink);
	}

	public WebElement signInBtn() {
		return driver.findElement(signInBtn);
	}

	public WebElement errorMsg() {
		return driver.findElement(errorMsg);
	}

	// Forgot password part
	By nameInp = By.xpath("//input[@placeholder='Name']");
	By emailInp = By.xpath("//input[@placeholder='Email']");
	By phoneInp = By.xpath("//input[@placeholder='Phone Number']");
	By resetBtn = By.className("reset-pwd-btn");
	By goToLoginBtn = By.className("go-to-login-btn");

	public WebElement nameInp() {
		return driver.findElement(nameInp);
	}

	public WebElement emailInp() {
		return driver.findElement(emailInp);
	}

	public WebElement phoneInp() {
		return driver.findElement(phoneInp);
	}

	public WebElement resetBtn() {
		return driver.findElement(resetBtn);
	}

	public WebElement goToLoginBtn() {
		return driver.findElement(goToLoginBtn);
	}

}
