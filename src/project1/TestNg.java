package project1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNg {
//	@Test()
//	public void test()
//	{
//		String x="gyan";
//		String y="gyana";
//		try {
//			Assert.assertEquals(x, y);
//		}
//		catch(AssertionError t)
//		{
//			
//		}
//		System.out.println("gyan");
//	}
//	@Test
//	public void dropDown()
//	{
//		WebDriver driver= new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("http://toolsqa.com/automation-practice-form/");
//		Select select= new Select(driver.findElement(By.id("continents")));
//		boolean found =false;
//		List<WebElement> droplist=select.getOptions();
//		for(int i=0;i<droplist.size();i++)
//		{
//			System.out.println(droplist.get(i).getText());
//			droplist.get(i).click();
//			
//			
//		}
//		
//	}
	@Test
	public void links()
	{
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		String mainWindow=driver.getWindowHandle();
		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> set =driver.getWindowHandles();
		System.out.println(set.size());
		// Using Iterator to iterate with in windows
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()){
			String childWindow=itr.next();
		   	// Compare whether the main windows is not equal to child window. If not equal, we will close.
			if(!mainWindow.equals(childWindow)){
			driver.switchTo().window(childWindow);
			System.out.println(driver.switchTo().window(childWindow).getTitle());
			driver.close();
			}
		}
		// This is to switch to the main window
		driver.switchTo().window(mainWindow);
		}
		
	}



