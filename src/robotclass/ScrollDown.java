package robotclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDown {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,100)");
		//WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Games')]"));
		
		//js.executeScript("arguments[0].scrollIntoView();", element);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

}
