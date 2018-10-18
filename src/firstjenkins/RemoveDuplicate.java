package firstjenkins;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver= new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.google.com/gmail/about/");
	driver.findElement(By.xpath("html/body/nav/div/a[3]")).click();
	Set<String> window=driver.getWindowHandles();
	Iterator<String> it=window.iterator();
	String parents=it.next();
	String child=it.next();
	driver.switchTo().window(child);
	Assert.assertTrue(driver.getPageSource().contains("Create your Google Account"), "element is not present");
	driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys("gyan");
	
	


	}

}
