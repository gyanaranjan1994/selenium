package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBroswerTesting {
	WebDriver driver;
	@Test
	@Parameters("broswers")
	public void verifyTitle(String broswerName)
	{
		if(broswerName.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(broswerName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\selenium\\OrangeaHRM\\CommonJarFiles\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(broswerName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","D:\\selenium\\OrangeaHRM\\CommonJarFiles\\IEDriverServer.exe");
		}
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
	}

}
