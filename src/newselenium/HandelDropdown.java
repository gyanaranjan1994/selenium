package newselenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandelDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		//driver.findElement(By.xpath(".//*[@id='oneWay']/form/div[1]/ul/li[1]/input[1]")).click();
	
		boolean b=driver.findElement(By.xpath(".//*[@id='header-addons']/ul/li[6]/a")).isDisplayed();
		System.out.println(b);
		boolean s=driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_0']")).isSelected();
		System.out.println(s);
		boolean s1=driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).isSelected();
		System.out.println(s1);


	}

}
