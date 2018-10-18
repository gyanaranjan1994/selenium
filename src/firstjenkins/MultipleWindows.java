package firstjenkins;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class MultipleWindows {
	
//	public static void handelWindow(WebDriver driver)
//	{
//		Iterator<String> it=driver.getWindowHandles().iterator();
//		while(it.hasNext())
//		{
//			driver.switchTo().window(it.next());
//			
//		}
//	}
	public static WebDriver driver;
	public static Boolean switchToWindow(String title) {
	    String Parent_window = driver.getWindowHandle();
	    Set<String> handles = driver.getWindowHandles();
	    for(String handle : handles) {
	        driver.switchTo().window(handle);
	        if (driver.getTitle().equalsIgnoreCase(title)) {
	            return true;
	        }
	    }
	    driver.switchTo().window(Parent_window);
	    return false;
	}
	@Test()
	public static void window() throws IOException, Throwable
	{
		 driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/gmail/about/");
		driver.findElement(By.xpath("html/body/nav/div/a[3]")).click();
		switchToWindow("Gmail - Free Storage and Email from Google");
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("gyan");
		driver.findElement(By.xpath(".//*[@id='initialView']/footer/ul/li[1]/a")).click();
		switchToWindow("");
		Iterator<String> it=driver.getWindowHandles().iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
		
	
		
		
	}

}
