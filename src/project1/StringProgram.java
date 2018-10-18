package project1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class StringProgram {
	WebDriver driver= new FirefoxDriver();
	@Test
	public void setUp()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.guru99.com/");
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='featured-box cloumnsize1']//ul//descendant::li"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase("Live Testing Project"))
			{
				list.get(i).click();
			}
			
		}
	}

}
