package links;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksByArrayList {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		int countvalid=0;
		int hidden=0;
		int windows=0;
		List<WebElement> links=driver.findElements(By.tagName("a"));
		String mainwindow =driver.getWindowHandle();
		for(int i=0;i<links.size();i++)
		{
			//if links name is not empty or visible
			if(!links.get(i).getText().isEmpty())
			{
				//links.get(i).click();
				
				try {
				driver.findElement(By.linkText(links.get(i).getText())).click();
				countvalid++;
				Set<String> window=driver.getWindowHandles();
				Iterator<String> it=window.iterator();
				while(it.hasNext())
				{
					String child=it.next();
					if(!mainwindow.equals(child))
					{
						String titel=driver.switchTo().window(child).getTitle();
						System.out.println("window titel is: "+titel);
						windows++;
						driver.close();
					}
				}
				driver.switchTo().window(mainwindow);
				String url=driver.getCurrentUrl();
				System.out.println(url);
				driver.navigate().back();
				links=driver.findElements(By.tagName("a"));
				}
				catch(Exception e)
				{
					
				}
			}
			else
			{
				System.out.println("Invisible links..............."+i);
				hidden++;
			}
		}
		System.out.println("total valid links: "+countvalid);
		System.out.println("total invalid links: "+hidden);
		System.out.println("total window: "+windows);

	} 

}
