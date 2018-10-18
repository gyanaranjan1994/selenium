package firstjenkins;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class SingleWindow {

	@Test
    public void window() throws Throwable
	{
		
		
		try {
			WebDriver driver= new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.navigate().to("https://www.google.com/gmail/about/");
			Set<String> window=driver.getWindowHandles();
			driver.findElement(By.xpath("html/body/nav/div/a[3]")).click();
			Iterator<String> it=window.iterator();
			String parentes=it.next();
			String child =it.next();
			driver.switchTo().window(child);
			driver.findElement(By.id("firstName")).sendKeys("gyan");
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(parentes);
			Thread.sleep(2000);
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
		
	}
}
