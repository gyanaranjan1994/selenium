package links;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllValidLinks {

	public static void main(String[] args) {
		String url=" ";
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		Iterator<WebElement> it=links.iterator();
		while(it.hasNext())
		{
			url=it.next().getAttribute("href");
			System.out.println(url);
			try {
			if(url==null||url.isEmpty())
			{
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			else
			{
				url=it.next().getText();
				driver.findElement(By.linkText(url)).click();
				driver.navigate().back();
				continue;
			}
			}catch(Exception e)
			{
				
			}
			
			
		}

	}

}
