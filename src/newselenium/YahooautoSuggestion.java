package newselenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooautoSuggestion {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://in.yahoo.com/");
		//ArrayList<String> arr= new ArrayList<String>();
		driver.findElement(By.xpath("//input[@id='uh-search-box']")).sendKeys("java");
		List<WebElement> suggestion=driver.findElements(By.xpath("//ul[@role='listbox']/descendant::li[@class='yui3-aclist-item']"));
		for(WebElement s:suggestion)
		{
			System.out.println(s.getText());
			if(s.getText().equalsIgnoreCase("javascript:"))
			{
				s.click();
				break;
			}
		}
		

	}

}
