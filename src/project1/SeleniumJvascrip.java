package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumJvascrip {
	@Test
	public void javaScriptE() throws Throwable
	{
		WebDriver driver =new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("gyanaranjan");
		driver.findElement(By.name("password")).sendKeys("test123");
		Thread.sleep(1000);
		WebElement element=driver.findElement(By.xpath("//input[@value='Login']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		driver.switchTo().frame("mainpanel");
		WebElement element1=driver.findElement(By.xpath("//a[contains(text(),'Combined Form')]"));
		js.executeScript("arguments[0].click();",element1);
		WebElement element2=driver.findElement(By.id("company_name"));
		js.executeScript("arguments[0].value='gyan';",element2);

	}

}
