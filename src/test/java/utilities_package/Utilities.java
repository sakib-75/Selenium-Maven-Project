package utilities_package;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public interface Utilities {

	default void implicitWait(WebDriver driver) {
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	default void takeScreenshot(WebDriver driver, String fileWithPath) throws IOException {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File DestFile = new File(fileWithPath);
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}

	default void warningMessage(String aMsg, String eMsg) {
		System.out.println("Actual Message: " + aMsg);
		System.out.println("Expected Message: " + eMsg);
		Assert.assertEquals(aMsg, eMsg);

	}

}
