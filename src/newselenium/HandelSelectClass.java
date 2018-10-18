package newselenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandelSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		/*Select select= new Select(driver.findElement(By.id("Adults")));
		List<WebElement> drop=select.getAllSelectedOptions();
		for(WebElement drops:drop)
		{
			System.out.println(drops.getText());
		}*/
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Hotels')]"));
//		js.executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//div[contains(text(),'Recruiters')]")).click();
		WebElement element=driver.findElement(By.xpath("//a[text()='All Recruiters']"));
		Set<String> links=driver.getWindowHandles();
		Iterator<String> it=links.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.switchTo().frame(driver.findElement(By.id("40927c9020693f38")));
		element.click();
		

	}

}
