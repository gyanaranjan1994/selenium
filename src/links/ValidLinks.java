package links;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidLinks {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		ArrayList<String> validLinks= new ArrayList<String>();
		List<WebElement> links=driver.findElements(By.xpath("//a[contains(@href,'https')]"));
		for(WebElement s:links)
		{
			//System.out.println(s.getText());
			
				validLinks.add(s.getText());
			
		}
		for(String p: validLinks)
		{
			try {
				
			driver.findElement(By.linkText(p)).click();
			System.out.println(p);
			driver.navigate().back();
			}catch(Exception e)
			{
				break;
			}
		}
		

	}

}
