package firstjenkins;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandelFrame {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String path="//a[contains(text(),'Pipeline')]";
		String path1="//a[contains(text(),'Contacts')]";
		frame(driver, path);
		driver.navigate().back();
		Thread.sleep(1000);
		frame(driver, path1);
		
		
		

	}
	public static void frame(WebDriver driver,String path) throws InterruptedException
	{
		List<WebElement> frame=driver.findElements(By.tagName("frame"));
			for(int i=0;i<frame.size();i++)
			{
				driver.switchTo().frame(i);
				try {
					driver.findElement(By.xpath(path)).click();
					driver.switchTo().defaultContent();
					break;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					driver.switchTo().defaultContent();
					
				}
			}
	}

}
