package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgReport {
	@Test
	public void verifyTitel()
	{
		WebDriver driver= new FirefoxDriver();
		Reporter.log("broser load");
		driver.get("http://www.facebook.com");
		Reporter.log("open url");
		
	}

}
