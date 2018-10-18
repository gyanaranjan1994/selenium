package newselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HighLight {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\freeCRMtest\\jarfile\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
		highLightElement(driver, username);
		Thread.sleep(1000);
		username.sendKeys("gyan");
		highLightElement(driver, password);
		Thread.sleep(1000);
		password.sendKeys("ranjan");
		highLightElement(driver, login);
		Thread.sleep(1000);
		login.click();

	}
	public static void highLightElement(WebDriver driver, WebElement element)
	{
	JavascriptExecutor js=(JavascriptExecutor)driver; 

	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

	try 
	{
	Thread.sleep(500);
	} 
	catch (InterruptedException e) {

	System.out.println(e.getMessage());
	} 

	js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 

	}

}
