package newselenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleHandel {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		ArrayList<String> text= new ArrayList<String>();
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("java");
		//ul[@class='sbsb_b']/li[@role='presentation']
		//ul[@class='sbsb_b']/descendant::li
		List<WebElement> links=driver.findElements(By.xpath("//ul[@class='sbsb_b']/li[@role='presentation']"));
		for(WebElement c:links)
		{
			/*if (c.getText().equals("java online compiler")) {
				c.click();
				break;*/
			text.add(c.getText());
			
		
				
			}
		for(String s:text)
		{
			driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(s+Keys.ENTER);
			driver.navigate().back();
		}
		
		/*List<WebElement> vlinks=driver.findElements(By.xpath("//div[@id='res']//a"));
		for (WebElement s: vlinks) {
			if (s.getText().contains("Online Java Compiler - online editor - OnlineGDB")) {
				s.click();
				break;
			}
		}
*/
	}

}
