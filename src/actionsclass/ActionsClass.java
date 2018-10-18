package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ActionsClass {
	@Test
	public void actionClass() throws Throwable
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.get("https://www.spicejet.com/");
		String url=js.executeScript("return document.URL;").toString();
		System.out.println(url);
		String titel=js.executeScript("return document.title;").toString();
		System.out.println(titel);
		Actions action= new Actions(driver);
		WebElement element= driver.findElement(By.xpath(".//*[@id='highlight-addons']"));
		action.moveToElement(element).build().perform();
		WebElement element1=driver.findElement(By.xpath("//a[contains(text(),'SpiceMax')]"));
		clickOn(driver, 10, element1);
		Thread.sleep(2000);
		js.executeScript("history.go(0)");
		js.executeScript("window.location='https://www.facebook.com'");
		js.executeScript("alert('welcome to selenium')");
		//action.sendKeys(Keys.PAGE_DOWN).perform();
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("Create a Page")).click();
		//Thread.sleep(2000);
		//action.sendKeys(Keys.PAGE_UP).build().perform();
		
		
	}
	public static void clickOn(WebDriver driver,int timeout,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
