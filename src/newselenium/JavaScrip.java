package newselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScrip {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.co.in/");
		/*JavascriptExecutor jsp= (JavascriptExecutor)driver;
		jsp.executeScript("document.getElementById('email').value='gyan'");
		jsp.executeScript("window.scrollBy(0,200)");*/
		//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li[1]
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Google Search']//preceding::input[2]")).sendKeys("selenium");
		String beforxpath="//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li[";
		String afterxpath="]";
		int i=1;
		while(i>0)
		{
			String text=driver.findElement(By.xpath(beforxpath+i+afterxpath)).getText();
			System.out.println(text);
			i++;
			
		}

	}

}
