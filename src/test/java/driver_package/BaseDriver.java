package driver_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	
	public static String baseUrl = "https://rahulshettyacademy.com/locatorspractice/";
	public static WebDriver driver = null;
	
	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void endSession() {
		driver.quit();
	}
	

}
