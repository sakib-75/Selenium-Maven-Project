package utilities_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public interface ImplicitlyWait {

	default void implicitWait(WebDriver driver) {
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
