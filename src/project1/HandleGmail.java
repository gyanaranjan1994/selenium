package project1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleGmail {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("demovivek00@gmail.com");
		driver.findElement(By.xpath("//content[@class='CwaK9']/span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vivek2233");
		driver.findElement(By.xpath("//content[@class='CwaK9']/span[text()='Next']")).click();
		driver.findElement(By.xpath("//a[@class='gb_b gb_ib gb_R']/span[@class='gb_db gbii']")).click();
		driver.findElement(By.xpath("//div[@title='Profile']")).click();
		List<WebElement> frame=driver.findElements(By.tagName("iframe"));
		System.out.println(frame.size());
		Thread.sleep(2000);
		for(int i=0;i<frame.size();i++)
		{
			Thread.sleep(2000);
			driver.switchTo().frame(i);
			try {
				driver.findElement(By.xpath("//div[text()='Select a photo from your computer']")).click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		/*driver.switchTo().frame(driver.findElement(By.xpath("html/body/div[20]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Select a photo from your computer']")).click();*/
	}

	

}
